package com.jnrise.server.util;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author wuweifeng wrote on 2017/10/26.
 */
public class CommonUtil {
    public static Date getNow() {
        return new Date();
    }

    /**
     * @param date
     *         年月日
     */
    public static Date dateOfStr(String date) {
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 只接受这样的格式2017-09-3，不能带时分秒
     *
     * @param date
     *         年月日
     * @return 该天的开始
     */
    public static Date beginOfDay(String date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return dateFormat.parse(date + " 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 只接受这样的格式2017-09-3，不能带时分秒
     *
     * @param date
     *         年月日
     * @return 该天的结束
     */
    public static Date endOfDay(String date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return dateFormat.parse(date + " 23:59:59");
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String randomUrl() {
        List<String> stringList = new ArrayList<>();
        String randomStr = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        //输入10以内随机数
        Random random = new Random(System.currentTimeMillis());
        StringBuilder builStr = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            //random生成的是类似[0,1),左包含又不包含的数，所以要+1
            char tempC = randomStr.charAt(random.nextInt(randomStr.length()));
            builStr.append(tempC);
        }
        return builStr.toString();
    }


    /**
     * 生成uuid
     */
    public static String token() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
