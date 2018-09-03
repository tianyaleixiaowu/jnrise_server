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

    /**
     * 保存聊天记录
     */
    @RequestMapping("/send")
    public BaseData send(String fromUserId, String toUserId, String content) throws Exception {
        return kefuManager.send(fromUserId, toUserId, content);
    }

    /**
     * 获取最近联系人
     */
    @RequestMapping("/contact")
    public BaseData contact(String kefuId)  {
        return kefuManager.contact(kefuId);
    }

    /**
     * 获取最近聊天记录
     */
    @RequestMapping("/history")
    public BaseData history(String fromId, String toId) {
        return kefuManager.history(fromId, toId);
    }

}
