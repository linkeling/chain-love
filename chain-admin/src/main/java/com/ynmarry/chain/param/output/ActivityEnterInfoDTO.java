package com.ynmarry.chain.param.output;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import com.ynmarry.chain.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 活动报名信息表DTO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "活动报名信息表DTO")
public class ActivityEnterInfoDTO extends BaseDTO {
    /** 主键id */
    @ApiModelProperty(value = "主键id")
    private Long id;
    /** 活动id */
    @ApiModelProperty(value = "活动id", position = 1)
    private Long acivityId;
    /** 客户id */
    @ApiModelProperty(value = "客户id", position = 2)
    private Long customerId;
    /** 联系电话 */
    @ApiModelProperty(value = "联系电话", position = 3)
    private String telphone;
    /** 客户姓名 */
    @ApiModelProperty(value = "客户姓名", position = 4)
    private String customerName;
    /** 缴费状态 0-未缴费 1-已缴费 2-已退款 */
    @ApiModelProperty(value = "缴费状态 0-未缴费 1-已缴费 2-已退款", position = 5)
    private Integer payStatus;
    /** 缴费金额 */
    @ApiModelProperty(value = "缴费金额", position = 6)
    private BigDecimal payNumber;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 7)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 8)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}