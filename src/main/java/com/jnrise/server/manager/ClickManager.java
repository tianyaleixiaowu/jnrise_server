package com.jnrise.server.manager;

import com.jnrise.server.model.Click;
import com.jnrise.server.repository.ClickRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/5/4.
 */
@Service
public class ClickManager {
    @Resource
    private ClickRepository clickRepository;

    public Click save(Click click) {
        //Click click1 = clickRepository.findByUuid(click.getUuid());
        //if (click1 == null) {
            return clickRepository.save(click);
        //} else {
        //    return click1;
        //}
    }
}
