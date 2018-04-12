package com.jnrise.server.controller;

import com.jnrise.server.bean.MobileData;
import com.jnrise.server.manager.MobileManager;
import com.jnrise.server.model.Mobile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@RestController
@RequestMapping("/mobile")
public class MobileController {
    @Resource
    private MobileManager mobileManager;

    @PostMapping
    public MobileData add(Mobile mobile) {
        Mobile temp = mobileManager.save(mobile);
        MobileData mobileData = new MobileData();
        mobileData.setCode(0);
        mobileData.setMobile(temp);
        return mobileData;
    }
}
