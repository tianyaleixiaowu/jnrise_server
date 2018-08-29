package com.jnrise.server.repository;

import com.jnrise.server.model.RongMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface RongMessageRepository extends JpaRepository<RongMessage, Long> {

    @Query(value = "select distinct fromUserId from RongMessage where toUserId = ?1")
    List<String> findByToUserId(String userId);
}
