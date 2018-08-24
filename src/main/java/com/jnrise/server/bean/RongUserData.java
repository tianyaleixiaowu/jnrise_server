package com.jnrise.server.bean;

import com.jnrise.server.model.RongUser;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/8/22.
 */
public class RongUserData extends BaseData {
    private List<RongUser> data;

    public List<RongUser> getData() {
        return data;
    }

    public void setData(List<RongUser> data) {
        this.data = data;
    }
}
