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
    public String encode(String data) {
        String[] array = data.split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (String ss : array) {
            stringBuilder.append(deal(ss)).append("\n");
        }

        return stringBuilder.toString();
    }

    private static String deal(String s) {
        String[] array = s.replace("channel=", "")
                .replace("original=", "")
                .replace("type1=", "")
                .replace("type2=", "").split("&");


        BaseUrlBean baseUrlBean = new BaseUrlBean();
        baseUrlBean.setChannel(array[0]);
        baseUrlBean.setOriginal(array[1]);
        baseUrlBean.setType1(array[2]);
        baseUrlBean.setType2(array[3]);
        String ss = "https://mm.jnrise.cn/loading/r1oxd5.html?sign=" + baseUrlBean.encrypt();
        System.out.println(ss);
        return ss;
    }
}
