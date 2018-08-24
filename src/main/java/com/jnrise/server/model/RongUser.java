package com.jnrise.server.model;

import com.jnrise.server.model.base.BaseEntity;

import javax.persistence.*;

/**
 * @author wuweifeng wrote on 2018/8/22.
 */
@Entity
@Table(name = "rong_user")
public class RongUser extends BaseEntity {

    private String token;

    /**
     * 1是瑞思客服，2是xx客服，0是普通用户
     */
    private Integer kefu;
    /**
     * 用户名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKefu() {
        return kefu;
    }

    public void setKefu(Integer kefu) {
        this.kefu = kefu;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
