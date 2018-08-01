package com.jnrise.server.model;


import com.jnrise.server.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 短链接
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "url")
public class Url extends BaseEntity {

}
