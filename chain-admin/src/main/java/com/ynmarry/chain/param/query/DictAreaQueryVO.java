package com.ynmarry.chain.param.query;
import com.ynmarry.chain.base.PaginationVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询地区字典VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "查询地区字典VO")
public class DictAreaQueryVO extends PaginationVO{

    /** id */
    @ApiModelProperty(value = "")
    private Long id;

    /** 区域编码; 行政区划代码 */
    @ApiModelProperty(value = "区域编码; 行政区划代码", position = 1)
    private String areaCode;

    /** 区域名称 */
    @ApiModelProperty(value = "区域名称", position = 2)
    private String areaName;

    /** 别名 */
    @ApiModelProperty(value = "别名", position = 3)
    private String alias;

    /** 区域全称 */
    @ApiModelProperty(value = "区域全称", position = 4)
    private String fullName;

    /** 区域级别;1省级;2市级;3县级;4乡级;5村委会 */
    @ApiModelProperty(value = "区域级别;1省级;2市级;3县级;4乡级;5村委会", position = 5)
    private Integer areaLevel;

    /** 父级编码 */
    @ApiModelProperty(value = "父级编码", position = 6)
    private String parentCode;

    /** 外部系统编码对照 */
    @ApiModelProperty(value = "外部系统编码对照", position = 7)
    private String externalSystemCode;

    /** 通用数据状态 0=正常 1=停用 2=软删 */
    @ApiModelProperty(value = "通用数据状态 0=正常 1=停用 2=软删", position = 8)
    private Integer status;

    /** created */
    @ApiModelProperty(value = "", position = 9)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    /** updated */
    @ApiModelProperty(value = "", position = 10)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}