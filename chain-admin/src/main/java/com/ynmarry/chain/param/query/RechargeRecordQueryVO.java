package com.ynmarry.chain.param.query;
import com.ynmarry.chain.base.PaginationVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询充值记录表VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "查询充值记录表VO")
public class RechargeRecordQueryVO extends PaginationVO{

    /** 主键id */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /** 用户id */
    @ApiModelProperty(value = "用户id", position = 1)
    private Long userId;

    /** 充值时间 */
    @ApiModelProperty(value = "充值时间", position = 2)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 充值金额 */
    @ApiModelProperty(value = "充值金额", position = 3)
    private BigDecimal payNumber;

    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 4)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 5)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}