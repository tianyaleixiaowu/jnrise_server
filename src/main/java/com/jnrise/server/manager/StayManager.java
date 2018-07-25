package com.jnrise.server.manager;

import com.jnrise.server.model.Stay;
import com.jnrise.server.repository.StayRepository;
import com.jnrise.server.util.CommonUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wuweifeng wrote on 2018/7/24.
 */
@Service
public class StayManager {
    @Resource
    private StayRepository stayRepository;

    public Stay add(Stay stay) {
        List<Stay> stays = stayRepository.findByUserId(stay.getUserId());
        if (CollectionUtils.isEmpty(stays)) {
            return stayRepository.save(stay);
        } else {
            Stay stay1 = stays.get(0);
            stay1.setTotalTime(stay.getTotalTime());
            stay1.setUpdateTime(CommonUtil.getNow());
            return stayRepository.save(stay1);
        }
    }

}
