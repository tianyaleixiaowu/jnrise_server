package com.jnrise.server.manager;

import com.jnrise.server.bean.ClickCountData;
import com.jnrise.server.model.ClickCount;
import com.jnrise.server.repository.ClickCountRepository;
import com.jnrise.server.specify.Criteria;
import com.jnrise.server.specify.Restrictions;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/7/24.
 */
@Service
public class ClickCountManager {
    @Resource
    private ClickCountRepository clickCountRepository;

    public ClickCount add(ClickCount clickCount) {
        //List<ClickCount> stays = clickCountRepository.findByUserId(clickCount.getUserId());
        //if (CollectionUtils.isEmpty(stays)) {
        //    return clickCountRepository.save(clickCount);
        //} else {
        //    ClickCount stay1 = stays.get(0);
        //    stay1.setTotalCount(stay1.getTotalCount() + 1);
        //    return clickCountRepository.save(stay1);
        //}
        return clickCountRepository.save(clickCount);
    }


    public ClickCountData query(String type, String beginTime, String endTime, String url) {
        Criteria<ClickCount> criteria = new Criteria<>();
        criteria.add(Restrictions.eq("type", type, true));
        criteria.add(Restrictions.gt("createTime", beginTime, true));
        criteria.add(Restrictions.lt("createTime", endTime, true));
        criteria.add(Restrictions.like("url", "%" + url + "%", true));

        ClickCountData clickCountData = new ClickCountData();
        clickCountData.setCode(0);
        clickCountData.setData(clickCountRepository.findAll(criteria));
        return clickCountData;
    }
}
