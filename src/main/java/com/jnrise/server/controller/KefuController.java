package com.jnrise.server.controller;

import com.jnrise.server.bean.BaseData;
import com.jnrise.server.manager.KefuManager;
import com.jnrise.server.model.RongUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/8/22.
 */
@RestController
@RequestMapping("/kefu")
public class KefuController {
    @Resource
    private KefuManager kefuManager;

    /**
     * 查询某机构的客服token信息
     * @param kefu
     * 1是瑞思
     * @return
     * 客服信息
     */
    @RequestMapping("")
    public BaseData queryKefuId(Integer kefu) {
        return kefuManager.findKefu(kefu);
    }

    @RequestMapping("/regist")
    public BaseData regist(RongUser rongUser) throws Exception {
        return kefuManager.regist(rongUser);
    }

    @RequestMapping("/send")
    public BaseData send(String userId, String kefuId, String cotent) throws Exception {
        return kefuManager.send(userId, kefuId, cotent);
    }

}
