package com.match.making.param.save;
import com.match.making.base.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 地区字典VO
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "地区字典VO")
public class DictAreaSaveVO extends BaseVO {
    /** id */
    @ApiModelProperty(value = "" , required = true)
    @NotNull(message = "不能为空")
    private Long id;
    /** 区域编码; 行政区划代码 */
    @ApiModelProperty(value = "区域编码; 行政区划代码", position = 1 , required = true)
    @NotNull(message = "区域编码; 行政区划代码不能为空")
    @Length(max=50, message = "区域编码; 行政区划代码不能大于50")
    private String areaCode;
    /** 区域名称 */
    @ApiModelProperty(value = "区域名称", position = 2 , required = true)
    @NotNull(message = "区域名称不能为空")
    @Length(max=50, message = "区域名称不能大于50")
    private String areaName;
    /** 别名 */
    @ApiModelProperty(value = "别名", position = 3 )
    @Length(max=50, message = "别名不能大于50")
    private String alias;
    /** 区域全称 */
    @ApiModelProperty(value = "区域全称", position = 4 , required = true)
    @NotNull(message = "区域全称不能为空")
    @Length(max=100, message = "区域全称不能大于100")
    private String fullName;
    /** 区域级别;1省级;2市级;3县级;4乡级;5村委会 */
    @ApiModelProperty(value = "区域级别;1省级;2市级;3县级;4乡级;5村委会", position = 5 , required = true)
    @NotNull(message = "区域级别;1省级;2市级;3县级;4乡级;5村委会不能为空")
    private Integer areaLevel;
    /** 父级编码 */
    @ApiModelProperty(value = "父级编码", position = 6 , required = true)
    @NotNull(message = "父级编码不能为空")
    @Length(max=50, message = "父级编码不能大于50")
    private String parentCode;
    /** 外部系统编码对照 */
    @ApiModelProperty(value = "外部系统编码对照", position = 7 )
    @Length(max=255, message = "外部系统编码对照不能大于255")
    private String externalSystemCode;
    /** 通用数据状态 0=正常 1=停用 2=软删 */
    @ApiModelProperty(value = "通用数据状态 0=正常 1=停用 2=软删", position = 8 )
    private Integer status;
    /** created */
    @ApiModelProperty(value = "", position = 9 , required = true)
    @NotNull(message = "不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** updated */
    @ApiModelProperty(value = "", position = 10 , required = true)
    @NotNull(message = "不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}