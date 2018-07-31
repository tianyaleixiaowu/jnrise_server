package com.jnrise.server.controller;

import com.jnrise.server.bean.BaseData;
import com.jnrise.server.manager.ModuleStayManager;
import com.jnrise.server.model.ModuleStay;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/7/31.
 */
@RestController
@RequestMapping("/moduleStay")
public class ModuleStayController {
    @Resource
    private ModuleStayManager moduleStayManager;

    @RequestMapping
    public BaseData add(ModuleStay stay) {
        moduleStayManager.add(stay);
        return new BaseData(0, "");
    }
}
