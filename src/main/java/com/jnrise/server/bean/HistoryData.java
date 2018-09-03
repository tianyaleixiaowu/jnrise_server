package com.jnrise.server.bean;

import com.jnrise.server.model.RongMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuweifeng wrote on 2018/9/3.
 */
public class HistoryData extends BaseData {
    private List<RongMessage> rongMessages = new ArrayList<>();

    public List<RongMessage> getRongMessages() {
        return rongMessages;
    }

    public void setRongMessages(List<RongMessage> rongMessages) {
        this.rongMessages = rongMessages;
    }
}
