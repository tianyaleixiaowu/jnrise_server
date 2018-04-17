package com.jnrise.server.requestbody;

import com.jnrise.server.bean.ChannelBean;

import java.util.List;

/**
 * 条件查询info
 * @author wuweifeng wrote on 2018/4/16.
 */
public class InfoQuery {
    private String begin;

    private String end;

    private List<ChannelBean> channels;

    private Integer page;

    private Integer size;

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public List<ChannelBean> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelBean> channels) {
        this.channels = channels;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
