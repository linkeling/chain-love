package com.match.making.param.output;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.match.making.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 相亲资料认证表DTO
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "相亲资料认证表DTO")
public class CustomerAttestationDTO extends BaseDTO {
    /** 主键id */
    @ApiModelProperty(value = "主键id")
    private Long id;
    /** 客户id */
    @ApiModelProperty(value = "客户id", position = 1)
    private Long customerId;
    /** 职业 */
    @ApiModelProperty(value = "职业", position = 2)
    private Long profession;
    /** 房产情况 */
    @ApiModelProperty(value = "房产情况", position = 3)
    private Long house;
    /** 车辆情况 */
    @ApiModelProperty(value = "车辆情况", position = 4)
    private Long isCar;
    /** 学历 */
    @ApiModelProperty(value = "学历", position = 5)
    private Long education;
    /** 是否认证 0-待认证 1-已经认证 */
    @ApiModelProperty(value = "是否认证 0-待认证 1-已经认证", position = 6)
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