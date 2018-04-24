package com.jnrise.server.manager;

import com.jnrise.server.model.Url;
import com.jnrise.server.repository.UrlRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@Service
public class UrlManager {
    @Resource
    private UrlRepository urlRepository;

    public Url find(String url) {
        return urlRepository.findFirstByUrl(url);
    }
}
