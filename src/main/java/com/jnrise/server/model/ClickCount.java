package com.jnrise.server.model;

import com.jnrise.server.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 点击总量
 * @author wuweifeng wrote on 2018/7/24.
 */
@Entity
@Table(name = "click_count")
public class ClickCount extends BaseEntity {
    private String url;

    private String userId;
    /**
     * 坐标
     */
    private String coordinate;

    private String otherInfo;

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

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
