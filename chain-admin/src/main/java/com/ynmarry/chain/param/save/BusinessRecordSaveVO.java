package com.ynmarry.chain.param.save;
import com.ynmarry.chain.base.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 交易记录表VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "交易记录表VO")
public class BusinessRecordSaveVO extends BaseVO {
    /** 主键id */
    @ApiModelProperty(value = "主键id" , required = true)
    @NotNull(message = "主键id不能为空")
    private Long id;
    /** 用户id */
    @ApiModelProperty(value = "用户id", position = 1 )
    private Long userId;
    /** 类型 1-充值 2-活动报名 */
    @ApiModelProperty(value = "类型 1-充值 2-活动报名", position = 2 )
    private Integer type;
    /** 充值金额 */
    @ApiModelProperty(value = "充值金额", position = 3 )
    private BigDecimal payMoney;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 4 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 5 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}