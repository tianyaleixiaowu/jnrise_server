package com.jnrise.server.repository;

import com.jnrise.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByAccount(String account);
}
