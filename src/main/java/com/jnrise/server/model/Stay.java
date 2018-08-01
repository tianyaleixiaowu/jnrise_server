package com.jnrise.server.model;

import com.jnrise.server.model.base.BaseEntity;

import javax.persistence.*;

/**
 * @author wuweifeng wrote on 2018/7/24.
 */
@Entity
@Table(name = "stay")
public class Stay extends BaseEntity {
    private Integer totalTime;
    private String otherInfo;

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

}
