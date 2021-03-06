package com.jnrise.server.model.base;

import com.jnrise.server.bean.BaseUrlBean;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wuweifeng wrote on 2017/10/25.
 */
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 渠道
     */
    private String channel;
    /**
     * 来源app、web
     */
    private String original;

    private String type1;

    private String type2;

    private String company;

    private String userId;

    private String url;
    private String param;

    private String ip;
    private String userAgent;

    private Date createTime = new Date();

    private Date updateTime = new Date();

    /**
     * 对4个属性进行的签名，不需要入库
     */
    @Transient
    private String sign;

    public void setSign(String sign) {
        //如果客户端传来的有sign，我们就去解析
        if (sign != null) {
            BaseUrlBean baseUrlBean = new BaseUrlBean().decrypt(sign);
            this.channel = baseUrlBean.getChannel();
            this.original = baseUrlBean.getOriginal();
            this.type1 = baseUrlBean.getType1();
            this.type2 = baseUrlBean.getType2();
        }
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", channel='" + channel + '\'' +
                ", original='" + original + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", company='" + company + '\'' +
                ", userId='" + userId + '\'' +
                ", url='" + url + '\'' +
                ", param='" + param + '\'' +
                ", ip='" + ip + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", sign='" + sign + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getSign() {
        return sign;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }
}
