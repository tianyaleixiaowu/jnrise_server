package com.jnrise.server.bean;

import com.jnrise.server.model.ClickCount;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuweifeng wrote on 2018/8/27.
 */
public class ClickCountData extends BaseData {

    private List<ClickCount> data = new ArrayList<>();

    public List<ClickCount> getData() {
        return data;
    }

    public void setData(List<ClickCount> data) {
        this.data = data;
    }
}
