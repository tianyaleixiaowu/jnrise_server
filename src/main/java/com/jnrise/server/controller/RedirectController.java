package com.jnrise.server.controller;

import com.jnrise.server.manager.UrlManager;
import com.jnrise.server.model.Url;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * 短信短链接重定向
 * @author wuweifeng wrote on 2018/4/24.
 */
@Controller
public class RedirectController {
    @Resource
    private UrlManager urlManager;

    @RequestMapping("/{s}")
    public String redirect(@PathVariable String s, HttpServletResponse response) throws Exception {
        Url url = urlManager.find(s);
        return "redirect:http://mm.jnrise.cn/loading/gMtz7R.html?channel=" + url.getChannel() + "&original=" +
                url.getOriginal() + "&type1=" + url.getType1() + "&type2=" + url.getType2();
    }


}
