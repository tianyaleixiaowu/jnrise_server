package com.jnrise.server.model;

import com.jnrise.server.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author wuweifeng wrote on 2018/5/4.
 */
@Entity
@Table(name = "click")
public class Click extends BaseEntity {
    private String uuid;
    /**
     * 1 mobile  0 web
     */
    private byte deviceType;
    /**
     * text-click 1,text-change 2,button-click 3
     */
    private byte clickType;
    private String otherInfo;

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public byte getClickType() {
        return clickType;
    }

    public void setClickType(byte clickType) {
        this.clickType = clickType;
    }

    public byte getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(byte deviceType) {
        this.deviceType = deviceType;
    }
}
