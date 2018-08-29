package com.jnrise.server.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuweifeng wrote on 2018/8/29.
 */
public class ContactUserData extends BaseData {
    private List<String> data = new ArrayList<>();

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
