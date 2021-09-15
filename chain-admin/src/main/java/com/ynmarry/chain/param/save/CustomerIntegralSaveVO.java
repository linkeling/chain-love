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
 * 等级积分关系表VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "等级积分关系表VO")
public class CustomerIntegralSaveVO extends BaseVO {
    /** 主键id */
    @ApiModelProperty(value = "主键id" , required = true)
    @NotNull(message = "主键id不能为空")
    private Long id;
    /** 客户等级 */
    @ApiModelProperty(value = "客户等级", position = 1 )
    private Integer customerId;
    /** 积分 */
    @ApiModelProperty(value = "积分", position = 2 )
    private Integer integral;
    /** 状态 0-无效 1-有效 */
    @ApiModelProperty(value = "状态 0-无效 1-有效", position = 3 )
    private Integer status;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 4 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 5 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}