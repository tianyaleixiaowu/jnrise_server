package com.jnrise.server.bean;

import com.jnrise.server.util.AESOperator;

/**
 * @author wuweifeng wrote on 2018/4/19.
 */
public class BaseUrlBean {
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

    public static void main(String[] args) {
        //BaseUrlBean baseUrlBean = new BaseUrlBean();
        //baseUrlBean.setChannel("xhl_2693_jiushu_h5");
        //baseUrlBean.setOriginal("");
        //baseUrlBean.setType1("b");
        //for (int i = 1; i <= 30; i++) {
        //    baseUrlBean.setType2(0 + "");
        //    System.out.println("https://mm.jnrise.cn:88/loading/r1oxd5.html?sign=" + baseUrlBean.encrypt());
        //}
        String s = "channel=xhl&original=1331&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2127&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2128&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2509&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2564&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2566&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2567&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2568&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=dianji&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=dianji&type2=xueke_tc";
        String[] array = s.split("\n");
        for (String ss : array) {
            deal(ss);
        }
    }

    public static void deal(String s) {
        String[] array = s.replace("channel=","")
                .replace("original=","")
                .replace("type1=","")
                .replace("type2=", "").split("&");

        BaseUrlBean baseUrlBean = new BaseUrlBean();
        baseUrlBean.setChannel(array[0]);
        baseUrlBean.setOriginal(array[1]);
        baseUrlBean.setType1(array[2]);
        baseUrlBean.setType2(array[3]);
        System.out.println("https://mm.jnrise.cn/loading/r1oxd5.html?sign=" + baseUrlBean.encrypt());
    }

    /**
     * 加密
     * @return 密串
     */
    public String encrypt() {
        return AESOperator.getInstance().encrypt(channel + "," + original + "," + type1 + "," + type2);
    }

    public BaseUrlBean decrypt(String sign) {
        String originalStr = AESOperator.getInstance().decrypt(sign);
        String[] array = originalStr.split(",");
        try {
            this.channel = array[0];
            this.original = array[1];
            this.type1 = array[2];
            this.type2 = array[3];
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
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
