package com.jnrise.server.manager;

import com.jnrise.server.bean.InfoListData;
import com.jnrise.server.bean.InfoVO;
import com.jnrise.server.bean.SimplePage;
import com.jnrise.server.excel.InfoExcel;
import com.jnrise.server.model.Info;
import com.jnrise.server.repository.InfoRepository;
import com.jnrise.server.requestbody.InfoQuery;
import com.jnrise.server.specify.Criteria;
import com.jnrise.server.specify.LogicalExpression;
import com.jnrise.server.specify.Restrictions;
import com.jnrise.server.util.CommonUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@Service
public class InfoManager {
    @Resource
    private InfoRepository infoRepository;
    @Resource
    private ChannelManager channelManager;

    public Info save(Info info) {
        if (existMobile(info.getPhone())) {
            return null;
        }
        return infoRepository.save(info);
    }

    /**
     * 查询留资
     *
     * @param channel
     *         渠道
     */
    public List<InfoVO> query(String channel, String company, String begin, String end) {
        Date beginDate = CommonUtil.beginOfDay(begin);
        Date endDate = CommonUtil.endOfDay(end);
        Criteria<Info> criteria = new Criteria<>();
        criteria.add(Restrictions.gte("createTime", beginDate, true));
        criteria.add(Restrictions.lte("createTime", endDate, true));
        criteria.add(Restrictions.eq("company", company, true));
        List<Info> infos = infoRepository.findAll(criteria);


        return infos.stream().map(this::parse).collect(Collectors.toList());
    }

    private InfoVO parse(Info info) {
        InfoVO infoVO = new InfoVO();
        BeanUtils.copyProperties(info, infoVO);
        return infoVO;
    }

    /**
     * 条件查询
     *
     * @param infoQuery
     *         infoQuery
     * @return 数据集
     */
    public InfoListData query(InfoQuery infoQuery) {
        InfoListData infoListData = new InfoListData();
        if (StringUtils.isEmpty(infoQuery.getBegin()) || StringUtils.isEmpty(infoQuery.getEnd())) {
            infoListData.setCode(-1);
            infoListData.setMessage("起始结束时间不能为空");
        } else {
            Map<String, String> channels = channelManager.findName();
            Page<Info> infos = queryPage(infoQuery);
            List<Info> infoList = infos.getContent();
            for (Info info : infoList) {
                info.setChannel(channels.get(info.getChannel()));
            }
            SimplePage<Info> simplePage = new SimplePage<>(infos.getTotalPages(), infos.getTotalElements(), infoList);

            infoListData.setCode(0);
            infoListData.setSimplePage(simplePage);
        }
        return infoListData;
    }

    public List<InfoExcel> excel(InfoQuery infoQuery) {
        List<Info> infos = queryPage(infoQuery).getContent();
        List<InfoExcel> list = new ArrayList<>();
        for (Info info : infos) {
            InfoExcel infoExcel = new InfoExcel();
            BeanUtils.copyProperties(info, infoExcel);
            list.add(infoExcel);
        }
        return list;
    }

    private Page<Info> queryPage(InfoQuery infoQuery) {
        Criteria<Info> criteria = new Criteria<>();
        //开始时间
        Date begin = CommonUtil.dateOfStr(infoQuery.getBegin());
        criteria.add(Restrictions.gt("createTime", begin, true));
        Date end = CommonUtil.dateOfStr(infoQuery.getEnd());
        criteria.add(Restrictions.lt("createTime", end, true));

        List<String> channels = infoQuery.getChannels();
        String channelsStr = infoQuery.getChannelsStr();
        if (channelsStr != null) {
            String[] cc = channelsStr.split(",");
            channels = new ArrayList<>(Arrays.asList(cc));
        }
        //if(channels != null && channels.size() > 0) {
        //    LogicalExpression[] logicalExpressionList = new LogicalExpression[channels.size()];
        //    for (int i = 0; i < logicalExpressionList.length; i++) {
        //        ChannelBean channelBean = channels.get(i);
        //        SimpleExpression s1 = Restrictions.eq("original", channelBean.getOriginal(), true);
        //        LogicalExpression s2 = Restrictions.in("channel", channelBean.getChannel(), true);
        //
        //        LogicalExpression one = Restrictions.and(s1, s2);
        //        logicalExpressionList[i] = one;
        //    }
        //    criteria.add(Restrictions.or(logicalExpressionList));
        //}

        if (channels != null && channels.size() > 0) {
            LogicalExpression s2 = Restrictions.in("channel", channels, true);
            criteria.add(s2);
        } else {
            criteria.add(Restrictions.ne("channel", "test", true));
        }
        String company = infoQuery.getCompany();
        if (company != null && !"".equals(company)) {
            criteria.add(Restrictions.eq("company", company, true));
        }

        int page = 0;
        if (infoQuery.getPage() != null) {
            page = infoQuery.getPage();
        }
        int size = 10;
        if (infoQuery.getSize() != null) {
            size = infoQuery.getSize();
        }
        Sort.Direction direction = Sort.Direction.DESC;
        Sort sort = new Sort(direction, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        return infoRepository.findAll(criteria, pageable);
    }

    /**
     * 是否已存在的手机号
     *
     * @param mobile
     *         mobile
     * @return 是否已存在
     */
    public boolean existMobile(String mobile) {
        return infoRepository.findByPhone(mobile).size() > 0;
    }

}
