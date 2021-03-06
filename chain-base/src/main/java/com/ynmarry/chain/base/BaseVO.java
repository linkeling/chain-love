/* Copyright (c) 2018, yiboshi.com All Rights Reserved. */
package com.ynmarry.chain.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ynmarry.chain.Constants;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * VO基类
 * @author NEGI
 * @version 2018-10
 */
public abstract class BaseVO {
    @ApiModelProperty(value="主键id",hidden = true)
//    @NotNull(groups = {ValidatorGroup.Update.class})
    private Long id;

    @ApiModelProperty(hidden = true)
    @JsonIgnore
    private Long operId;

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

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toStringExclude(this, Constants.excludeFieldNames);
    }
}
