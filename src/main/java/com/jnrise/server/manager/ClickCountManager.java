package com.jnrise.server.manager;

import com.jnrise.server.model.ClickCount;
import com.jnrise.server.repository.ClickCountRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wuweifeng wrote on 2018/7/24.
 */
@Service
public class ClickCountManager {
    @Resource
    private ClickCountRepository clickCountRepository;

    public ClickCount add(ClickCount clickCount) {
        List<ClickCount> stays = clickCountRepository.findByUserId(clickCount.getUserId());
        if (CollectionUtils.isEmpty(stays)) {
            return clickCountRepository.save(clickCount);
        } else {
            ClickCount stay1 = stays.get(0);
            stay1.setTotalCount(stay1.getTotalCount() + 1);
            return clickCountRepository.save(stay1);
        }

    }

}
