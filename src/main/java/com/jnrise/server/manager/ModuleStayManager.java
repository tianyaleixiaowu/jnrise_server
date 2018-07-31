package com.jnrise.server.manager;

import com.jnrise.server.model.ModuleStay;
import com.jnrise.server.repository.ModuleStayRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/7/24.
 */
@Service
public class ModuleStayManager {
    @Resource
    private ModuleStayRepository moduleStayRepository;

    public ModuleStay add(ModuleStay stay) {
        return moduleStayRepository.save(stay);
    }

}
