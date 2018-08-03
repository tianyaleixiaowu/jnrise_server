package com.jnrise.server.sms;

import com.jnrise.server.bean.BaseData;
import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Random;

/**
 * @author wuweifeng wrote on 2018/8/3.
 */
@Component
public class SmsUtil {
    @Resource
    private YunpianClient yunpianClient;

    public BaseData send(String mobile) {
        Map<String, String> param = yunpianClient.newParam(2);
        param.put(YunpianClient.MOBILE, mobile);

        int code = randomInt(1001, 9999);

        BaseData baseData = new BaseData();
        param.put(YunpianClient.TEXT, "【麦盟科技】您注册瑞思学科英语的验证码是" + code + "。如非本人操作，请忽略本短信");
        Result<SmsSingleSend> r = yunpianClient.sms().single_send(param);
        //获取返回结果，返回码:r.getCode(),返回码描述:r.getMsg(),API结果:r.getData(),其他说明:r.getDetail(),调用异常:r.getThrowable()
        if (r.getCode() == 0) {
            baseData.setCode(0);
            baseData.setMessage(code + "");
            return baseData;
        } else {
            baseData.setCode(-1);
            baseData.setMessage(r.getMsg() + "\n" + r.getDetail());
            return baseData;
        }
    }

    private int randomInt(int from, int to) {
        Random r = new Random();
        return from + r.nextInt(to - from);
    }
}
