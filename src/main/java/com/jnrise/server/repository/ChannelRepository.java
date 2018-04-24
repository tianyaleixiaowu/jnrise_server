package com.jnrise.server.repository;

import com.jnrise.server.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
