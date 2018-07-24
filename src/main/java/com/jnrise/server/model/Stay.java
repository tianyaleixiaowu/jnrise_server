package com.jnrise.server.model;

import com.jnrise.server.model.base.BaseEntity;

import javax.persistence.*;

/**
 * @author wuweifeng wrote on 2018/7/24.
 */
@Entity
@Table(name = "stay")
public class Stay extends BaseEntity {
    private String url;

    private String userId;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
