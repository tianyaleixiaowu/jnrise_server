package com.jnrise.server.model;


import com.jnrise.server.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户输入过的手机号
 * @author wuweifeng wrote on 2018/3/5.
 */
@Entity
@Table(name = "enter")
public class Enter extends BaseEntity {
}
