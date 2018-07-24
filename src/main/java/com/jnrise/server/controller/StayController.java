package com.jnrise.server.controller;

import com.jnrise.server.bean.BaseData;
import com.jnrise.server.manager.StayManager;
import com.jnrise.server.model.Stay;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/7/24.
 */
@RestController
@RequestMapping("/stay")
public class StayController {
    @Resource
    private StayManager stayManager;

    @RequestMapping
    public BaseData add(Stay stay) {
        stayManager.add(stay);
        return new BaseData(0, "");
    }
}
