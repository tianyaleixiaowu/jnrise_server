package com.jnrise.server.repository;

import com.jnrise.server.model.Click;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface ClickRepository extends JpaRepository<Click, Long> {
    Click findByUuid(String uuid);
}
