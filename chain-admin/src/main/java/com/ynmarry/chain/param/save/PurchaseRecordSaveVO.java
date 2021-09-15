package com.ynmarry.chain.param.save;
import com.ynmarry.chain.base.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 客户购买记录VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "客户购买记录VO")
public class PurchaseRecordSaveVO extends BaseVO {
    /** 主键id */
    @ApiModelProperty(value = "主键id" , required = true)
    @NotNull(message = "主键id不能为空")
    private Long id;
    /** 用户id */
    @ApiModelProperty(value = "用户id", position = 1 )
    private Long userId;
    /** 被购买用户id */
    @ApiModelProperty(value = "被购买用户id", position = 2 )
    private Long bePurchased;
    /** 消费积分 */
    @ApiModelProperty(value = "消费积分", position = 3 )
    private Integer integral;
    /** 消费时间 */
    @ApiModelProperty(value = "消费时间", position = 4 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 5 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 6 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}