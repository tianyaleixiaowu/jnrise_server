package com.jnrise.server.repository;

import com.jnrise.server.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface MobileRepository extends JpaRepository<Mobile, Long> {
    List<Mobile> findByPhone(String phone);
}
