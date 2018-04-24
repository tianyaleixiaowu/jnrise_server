package com.jnrise.server.manager;

import com.jnrise.server.model.Channel;
import com.jnrise.server.repository.ChannelRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wuweifeng wrote on 2018/4/24.
 */
@Service
public class ChannelManager {
    @Resource
    private ChannelRepository channelRepository;

    public List<Channel> findAll() {
        return channelRepository.findAll();
    }
}
