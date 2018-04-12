package com.jnrise.server.manager;

import com.jnrise.server.model.Info;
import com.jnrise.server.repository.InfoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
@Service
public class InfoManager {
    @Resource
    private InfoRepository infoRepository;

    public Info save(Info info) {
        return infoRepository.save(info);
    }

    /**
     * 是否已存在的手机号
     *
     * @param mobile
     *         mobile
     * @return 是否已存在
     */
    public boolean existMobile(String mobile) {
        return infoRepository.findByPhone(mobile).size() > 0;
    }

}
