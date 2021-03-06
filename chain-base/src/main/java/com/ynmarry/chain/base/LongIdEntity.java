/* Copyright (c) 2018, yiboshi.com All Rights Reserved. */
package com.ynmarry.chain.base;

import com.ynmarry.chain.Constants;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Objects;

/**
 * 数字Long型为主键的实体对象
 *
 * @author NEGI
 * @version 2019-02
 */
public class LongIdEntity extends BaseEntity {
    private static final transient long serialVersionUID = -5465261208735170332L;

    /**
     * 主键
     */
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getId() != null && obj instanceof LongIdEntity && ((LongIdEntity)obj).getId() != null) {
            return this.getId().equals(((LongIdEntity)obj).getId());
        } else {
            return (this == obj);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toStringExclude(this, Constants.excludeFieldNames);
    }
}