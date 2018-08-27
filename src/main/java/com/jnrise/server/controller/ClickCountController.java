package com.jnrise.server.controller;

import com.jnrise.server.bean.BaseData;
import com.jnrise.server.manager.ClickCountManager;
import com.jnrise.server.model.ClickCount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/7/24.
 */
@RestController
@RequestMapping("/clickCount")
public class ClickCountController {
    @Resource
    private ClickCountManager clickCountManager;

    @RequestMapping
    public BaseData add(ClickCount clickCount) {
        clickCountManager.add(clickCount);
        return new BaseData(0, "");
    }

    @RequestMapping("/query")
    public BaseData query(String type, String beginTime, String endTime, String url) {
        return clickCountManager.query(type, beginTime, endTime, url);
    }
}
