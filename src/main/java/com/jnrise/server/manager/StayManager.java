package com.jnrise.server.manager;

import com.jnrise.server.model.Stay;
import com.jnrise.server.repository.StayRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/7/24.
 */
@Service
public class StayManager {
    @Resource
    private StayRepository stayRepository;

    public Stay add(Stay stay) {
        return stayRepository.save(stay);
    }

}
