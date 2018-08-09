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
        String s = "channel=xhl&original=1331&type1=com.mampod.ergedd&type2=xueke_tc\n" +
                "channel=xhl&original=1331&type1=com.momo.kuaidubook&type2=xueke_tc\n" +
                "channel=xhl&original=1331&type1=com.shoujiduoduo.babysong&type2=xueke_tc\n" +
                "channel=xhl&original=1331&type1=com.sinyee.babybus.talk2kiki&type2=xueke_tc\n" +
                "channel=xhl&original=1331&type1=com.jueshihaoshu.yq20151223&type2=xueke_tc\n" +
                "channel=xhl&original=1331&type1=com.sinyee.babybus.shopping&type2=xueke_tc\n" +
                "channel=xhl&original=1331&type1=com.chancky.xuanyuanjian&type2=xueke_tc\n" +
                "channel=xhl&original=1331&type1=com.johnxyd.tonghuagushibaobao&type2=xueke_tc\n" +
                "channel=xhl&original=1331&type1=com.xunxin.popstarv&type2=xueke_tc\n" +
                "channel=xhl&original=1331&type1=chenmu.danmei.com&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.qihoo.browser&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.qihoo360.mobilesafe&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.qihoo.magic&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.qihoo.appstore&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.doubleopen.wxskzs&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.lite.infoflow&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.qihoo.cleandroid_cn&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.ludashi.benchmark&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.songheng.eastnews&type2=xueke_tc\n" +
                "channel=xhl&original=1681&type1=com.qihoo.freewifi&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=com.qihoo.browser&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=com.qihoo.cleandroid_cn&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=com.lockshowshow.android&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=com.qihoo.video&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=net.qihoo.360mobilesafe&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=com.cctv.caijing&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=com.qihoo360.launcher&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=com.moxiu.launcher&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=com.qihoo.magic&type2=xueke_tc\n" +
                "channel=xhl&original=1685&type1=com.doubleopen.wxskzs&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.tvmining.yao8&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.askfm&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.dc.geek&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.skout.android&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.zongyi.ndoudizhu&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.myyearbook.m&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.enflick.android.textnow&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.lionmobi.powerclean&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.pdragon.hd1010&type2=xueke_tc\n" +
                "channel=xhl&original=1942&type1=com.lionmobi.battery&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=tv.danmaku.bili&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=tv.danmaku.bilianime&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=com.baidu.video&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=android.zhibo8&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=com.baidu.videoiphone&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=com.xunlei.downloadprovider&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=com.baidu.yuedu&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=com.ygkj.chelaile.standard&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=com.zhibo8.client81136870&type2=xueke_tc\n" +
                "channel=xhl&original=2013&type1=com.jxedt&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=com.cashtoutiao&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=com.huaqian&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=qsbk.app&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=com.le123.ysdq&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=com.zhongduomei.rrmj.society&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=com.qiushibaike.qiushibaike&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=com.calendar.ui&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=com.storm.smart&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=com.hola.launcher&type2=xueke_tc\n" +
                "channel=xhl&original=2065&type1=com.freeme.widget.newspage&type2=xueke_tc\n" +
                "channel=xhl&original=2127&type1=com.android.browser&type2=xueke_tc\n" +
                "channel=xhl&original=2127&type1=com.yidian.org&type2=xueke_tc\n" +
                "channel=xhl&original=2127&type1=com.yidian.xiaomi&type2=xueke_tc\n" +
                "channel=xhl&original=2127&type1=com.agatha.reader&type2=xueke_tc\n" +
                "channel=xhl&original=2127&type1=com.xiaomi&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=441216572&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=cn.mmbd.app&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=com.baidu.yuedu&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=1056015676&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=com.intsig.camscanner&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=689941435&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=1097051783&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=803781859&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=1096562466&type2=xueke_tc\n" +
                "channel=xhl&original=2394&type1=1030220577&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=cn.eclicks.drivingtest&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=cn.eclicks.wzsearch&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=cn.autopai.violationquery&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=com.wanshua&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=com.baidu.yuedu&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=com.baidu.wenku&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=com.yinyuetai.ui&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=tv.yinyuetai.iphone&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=com.newcapec.mobile.ncp&type2=xueke_tc\n" +
                "channel=xhl&original=2408&type1=com.firebear.androil&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=com.mt.mtxx.mtxx&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=com.xunlei.downloadprovider&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=com.meitu.meiyancamera&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=com.hunantv.imgo.activity&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=com.meitu.mtxx&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=com.hunantv.imgotv&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=com.baihe&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=cn.wps.moffice_eng&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=com.baihe.online&type2=xueke_tc\n" +
                "channel=xhl&original=2410&type1=com.nice.main&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=com.jifen.qukan&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=com.hunantv.imgo.activity&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=com.baidu.yuedu&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=com.xunlei.downloadprovider&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=com.benqu.wuta&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=com.eonsun.myreader&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=com.hunantv.imgotv&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=com.benqumark.kuaimeikuaizhuang&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=com.handsgo.jiakao.android&type2=xueke_tc\n" +
                "channel=xhl&original=2532&type1=tv.yixia.bobo&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=baidu.weather.com.cn&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=wap.faloo.com&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=m.51yangsheng.com&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=wap.zol.com.cn&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=91baby.mama.cn&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=m.weather.com.cn&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=h5.cp.cashtoutiao.com&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=m.xilu.com&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=m.120ask.com&type2=xueke_tc\n" +
                "channel=xhl&original=2562&type1=wap.lieqinews.com&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=com.jifen.qukan&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=so.ofo.labofo&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=changdumagazine1.0&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=sina.mobile.tianqitong&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=com.cashtoutiao&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=com.sport.yuedong&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=com.baidu.yuedu&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=com.jxedt&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=cn.eclicks.drivingtest&type2=xueke_tc\n" +
                "channel=xhl&original=2615&type1=com.sogou.sogoureader&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=com.hunantv.imgo.activity&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=com.ygkj.chelaile.standard&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=com.android.dazhihui&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=com.qihoo.appstore&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=com.ijinshan.browser&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=com.hunantv.imgotv&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=com.qmsh.hbq&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=viva.reader&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=com.jrj.stock.level2&type2=xueke_tc\n" +
                "channel=xhl&original=2616&type1=com.itougu.app&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=689941435&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=com.cootek.smartdialer&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=1089336971&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=667831823&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=1330676140&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=657500465&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=1261794382&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=587366035&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=527809600&type2=xueke_tc\n" +
                "channel=xhl&original=2643&type1=com.pintao.business&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=1030220577&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=android.zhibo8&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=629774477&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=689941435&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=455611831&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=587366035&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=527809600&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=1056015676&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=1102002812&type2=xueke_tc\n" +
                "channel=xhl&original=2645&type1=906632439&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=527809600&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=667831823&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=548608066&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=620262310&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=512166629&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=com.yoloho.dayima&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=com.handsgo.jiakao.android&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=432488169&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=917670924&type2=xueke_tc\n" +
                "channel=xhl&original=2646&type1=1096562466&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=657500465&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=1035505740&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=1089445559&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=1089336971&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=587366035&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=380248105&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=1086911361&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=1100116796&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=909351158&type2=xueke_tc\n" +
                "channel=xhl&original=2647&type1=1090325914&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=com.cleanmaster.mguard_cn&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=com.tvmining.yao8&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=com.qm.market&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=com.android.dazhihui&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=com.coohua.xinwenzhuan&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=com.xunlei.downloadprovider&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=com.gw.dzhiphone622&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=com.ifeng.kuaitoutiao&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=org.linable.candy.snow2018&type2=xueke_tc\n" +
                "channel=xhl&original=2843&type1=com.cootek.smartdialer&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=com.songheng.eastnews&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=com.comicbook.mobile&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=com.wy.headlines&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=com.qm.market&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=viva.reader&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=cn.ecook&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=org.linable.candy.snow2018&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=com.calendar.ui&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=org.globalstory.app&type2=xueke_tc\n" +
                "channel=xhl&original=2847&type1=cn.asm.clweather&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=com.dmzj.manhua&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=com.sportfit.news&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=me.tenthirty.read&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=cn.touch.beauty&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=com.cyou.nijigen&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=com.jiaxiao.driveapp&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=com.duoduo.child.story&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=com.zongyi.ndoudizhu&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=com.chancky.ruyizhuan&type2=xueke_tc\n" +
                "channel=xhl&original=2848&type1=com.zkapp.todayhot&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=com.cleanmaster.mguard_cn&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=com.xunlei.downloadprovider&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=com.netease.news&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=com.cleanmaster.security_cn&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=com.ijinshan.kbatterydoctor&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=com.cashtoutiao&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=com.coohuaclient&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=com.coohua.xinwenzhuan&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=dopool.player&type2=xueke_tc\n" +
                "channel=xhl&original=3354&type1=com.zxly.market&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=com.moji.mjweather&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=com.jxedt&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=com.ym.ticket&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=cn.eclicks.wzsearch&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=com.browser2345&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=com.cootek.smartdialer&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=com.shoujiduoduo.ringtone&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=com.inveno.xiaozhi&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=com.browser_llqhz&type2=xueke_tc\n" +
                "channel=xhl&original=3357&type1=cn.opda.a.phonoalbumshoushou&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=com.xunlei.downloadprovider&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=com.netease.news&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=com.cootek.smartdialer&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=cn.wxsdj&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=com.jifen.qukan&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=com.ydtx.slof&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=com.shane.littlecartoonist&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=zsly.ychxg&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=com.inveno.xiaozhi&type2=xueke_tc\n" +
                "channel=xhl&original=3358&type1=com.lnks.sjdf&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=com.hunantv.imgo.activity&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=com.xunlei.downloadprovider&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=com.hunantv.imgotv3&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=cn.sqmaishou.app&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=com.hunantv.imgotv&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=com.wishcloud.health&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=cc.wwwnews.headline&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=com.meitu.mtxx&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=org.globalstory.app&type2=xueke_tc\n" +
                "channel=xhl&original=3381&type1=tv.danmaku.bili&type2=xueke_tc";
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
