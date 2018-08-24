package com.jnrise.server.repository;

import com.jnrise.server.model.RongMessage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface RongMessageRepository extends JpaRepository<RongMessage, Long> {
}
