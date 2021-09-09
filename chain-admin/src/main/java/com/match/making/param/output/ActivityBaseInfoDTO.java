package com.match.making.param.output;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import com.match.making.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 活动基本信息表DTO
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "活动基本信息表DTO")
public class ActivityBaseInfoDTO extends BaseDTO {
    /** 主键id */
    @ApiModelProperty(value = "主键id")
    private Long id;
    /** 标题 */
    @ApiModelProperty(value = "标题", position = 1)
    private String title;
    /** 活动内容 */
    @ApiModelProperty(value = "活动内容", position = 2)
    private String content;
    /** 活动时间 */
    @ApiModelProperty(value = "活动时间", position = 3)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date activityDate;
    /** 活动费用 */
    @ApiModelProperty(value = "活动费用", position = 4)
    private BigDecimal funds;
    /** 活动须知 */
    @ApiModelProperty(value = "活动须知", position = 5)
    private String notice;
    /** 活动状态 1-进行中 2-已完成 3-作废  */
    @ApiModelProperty(value = "活动状态 1-进行中 2-已完成 3-作废 ", position = 6)
    private Integer status;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 7)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 8)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}