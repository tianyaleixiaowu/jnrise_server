package com.jnrise.server.controller;

import com.jnrise.server.bean.BaseData;
import com.jnrise.server.manager.ClickManager;
import com.jnrise.server.model.Click;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@RestController
@RequestMapping("/click")
public class ClickController {
    @Resource
    private ClickManager clickManager;

    @PostMapping
    public BaseData add(Click click) {
        clickManager.save(click);
        return new BaseData(0, "");
    }
}
