package com.match.making.param.query;
import com.match.making.base.PaginationVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户喜欢记录VO
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "查询用户喜欢记录VO")
public class CustomerLikeRecordQueryVO extends PaginationVO{

    /** 主键id */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /** 用户id */
    @ApiModelProperty(value = "用户id", position = 1)
    private Long userId;

    /** 被喜欢客户id */
    @ApiModelProperty(value = "被喜欢客户id", position = 2)
    private Long customerId;

    /** 被喜欢用户id */
    @ApiModelProperty(value = "被喜欢用户id", position = 3)
    private Long customerUserId;

    /** 喜欢留言 */
    @ApiModelProperty(value = "喜欢留言", position = 4)
    private String message;

    /** 0-作废 1-有效 */
    @ApiModelProperty(value = "0-作废 1-有效", position = 5)
    private Integer status;

    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 6)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 7)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}