package com.jnrise.server.repository;

import com.jnrise.server.model.ClickCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface ClickCountRepository extends JpaRepository<ClickCount, Long>, JpaSpecificationExecutor<ClickCount> {
    List<ClickCount> findByUserId(String userId);
}
