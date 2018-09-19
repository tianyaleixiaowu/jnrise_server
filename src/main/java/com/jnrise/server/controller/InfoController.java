package com.jnrise.server.controller;

import com.jnrise.server.bean.InfoData;
import com.jnrise.server.bean.InfoListData;
import com.jnrise.server.manager.InfoManager;
import com.jnrise.server.model.Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@RestController
@RequestMapping("/info")
public class InfoController {
    @Resource
    private InfoManager infoManager;

    //https://gitee.com/lemur/easypoi这个有Excel导出的例子

    @PostMapping
    public InfoData save(Info info) {
        InfoData infoData = new InfoData();
        infoData.setCode(0);
        infoData.setInfo(infoManager.save(info));
        return infoData;
    }

    /**
     * 查询留资
     * @param channel 渠道
     */
    @GetMapping
    public InfoListData query(String channel) {
        return infoManager.query(channel);
    }

}
