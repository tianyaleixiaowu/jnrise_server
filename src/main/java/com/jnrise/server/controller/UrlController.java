package com.jnrise.server.controller;

import com.jnrise.server.bean.BaseUrlBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuweifeng wrote on 2018/8/9.
 */
@RestController
@RequestMapping("encode")
public class UrlController {


    @RequestMapping("")
    public String encode(BaseUrlBean baseUrlBean) {

        return deal(baseUrlBean);
    }

    private static String deal(BaseUrlBean baseUrlBean) {
        String ss = "https://mm.jnrise.cn/loading/r1oxd5.html?sign=" + baseUrlBean.encrypt();
        System.out.println(ss);
        return ss;
    }
}
