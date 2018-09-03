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

    @Query(value = "from RongMessage where (fromUserId = ?1 and toUserId = ?2) or (fromUserId = ?2 and toUserId = ?1)" +
            " order by id desc ")
    List<RongMessage> findMessages(String fromUserId, String toUserId);
}
