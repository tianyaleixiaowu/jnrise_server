package com.jnrise.server.repository;

import com.jnrise.server.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface UrlRepository extends JpaRepository<Url, Long> {
    Url findFirstByUrl(String url);
}
