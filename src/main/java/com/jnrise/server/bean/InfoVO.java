package com.jnrise.server.bean;

/**
 * @author wuweifeng wrote on 2019/3/28.
 */
public class InfoVO {
    /**
     * 手机号
     */
    private String phone;
    /**
     * 孩子姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别1男2女，0不填
     */
    private byte gender;
    /**
     * 校区
     */
    private String school;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
