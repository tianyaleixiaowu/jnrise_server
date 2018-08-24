package com.jnrise.server.repository;

import com.jnrise.server.model.RongUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface RongUserRepository extends JpaRepository<RongUser, Long> {
    /**
     * 查询瑞思（或其他）的客服
     *
     * @param kefu
     *         1是瑞思
     * @return 所有的客服
     */
    List<RongUser> findByKefu(Integer kefu);

    RongUser findByUserId(String userId);
}
