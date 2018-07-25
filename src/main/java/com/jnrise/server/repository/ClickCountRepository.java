package com.jnrise.server.repository;

import com.jnrise.server.model.ClickCount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface ClickCountRepository extends JpaRepository<ClickCount, Long> {
    List<ClickCount> findByUserId(String userId);
}
