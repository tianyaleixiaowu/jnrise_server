package com.jnrise.server.sms;

import com.yunpian.sdk.YunpianClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuweifeng wrote on 2018/8/3.
 */
@Configuration
public class SMSConfig {

    @Bean
    public YunpianClient yunpianClient() {
        return new YunpianClient("0517161859cdb8ec7018543af92bc049").init();
    }
}
