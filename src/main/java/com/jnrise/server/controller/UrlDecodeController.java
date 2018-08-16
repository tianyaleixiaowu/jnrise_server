package com.jnrise.server.controller;

import com.jnrise.server.bean.BaseUrlBean;
import com.jnrise.server.model.base.BaseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuweifeng wrote on 2018/8/9.
 */
@RestController
@RequestMapping("decode")
public class UrlDecodeController {

    @RequestMapping("")
    public Object decode(BaseEntity baseEntity) {
        if (baseEntity.getSign() != null) {
            return new BaseUrlBean().decrypt(baseEntity.getSign());
        }
        return "异常";
    }

}
