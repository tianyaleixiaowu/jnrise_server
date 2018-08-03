package com.jnrise.server.controller;

import com.jnrise.server.bean.BaseData;
import com.jnrise.server.sms.SmsUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/8/3.
 */
@RestController
@RequestMapping("/sms")
public class SmsController {
    @Resource
    private SmsUtil smsUtil;

    @RequestMapping
    public BaseData sms(String mobile) {
        return smsUtil.send(mobile);
    }
}
