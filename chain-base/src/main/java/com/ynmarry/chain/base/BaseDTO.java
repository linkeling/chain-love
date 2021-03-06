/* Copyright (c) 2018, yiboshi.com All Rights Reserved. */
package com.ynmarry.chain.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ynmarry.chain.Constants;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * DTO基类
 *
 * @author NEGI
 * @version 2018-08
 */
public class BaseDTO implements Serializable {
    @ApiModelProperty(value = "主键")
//    @JsonSerialize(using= ToStringSerializer.class)
    private Long id;
    @JsonIgnore
    @ApiModelProperty(value="操作人id", hidden = true)
    private Long operId;
    @JsonIgnore
    @ApiModelProperty(value="有效性", hidden = true)
    private Boolean validity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    public Boolean getValidity() {
        return validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toStringExclude(this, Constants.excludeFieldNames);
    }
}
