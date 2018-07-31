package com.jnrise.server.repository;

import com.jnrise.server.model.ModuleStay;
import com.jnrise.server.model.Stay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface ModuleStayRepository extends JpaRepository<ModuleStay, Long> {

}
