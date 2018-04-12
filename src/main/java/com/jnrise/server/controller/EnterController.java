package com.jnrise.server.controller;

import com.jnrise.server.bean.EnterData;
import com.jnrise.server.manager.EnterManager;
import com.jnrise.server.model.Enter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@RestController
@RequestMapping("/enter")
public class EnterController {
    @Resource
    private EnterManager enterManager;

    @PostMapping
    public EnterData add(Enter enter) {
        Enter temp = enterManager.save(enter);
        EnterData enterData = new EnterData();
        enterData.setCode(0);
        enterData.setEnter(temp);
        return enterData;
    }
}
