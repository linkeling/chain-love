package com.ynmarry.chain.param.query;
import com.ynmarry.chain.base.PaginationVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询枚举信息VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "查询枚举信息VO")
public class SysEnumQueryVO extends PaginationVO{

    /** id */
    @ApiModelProperty(value = "")
    private Long id;

    /** 枚举名称 */
    @ApiModelProperty(value = "枚举名称", position = 1)
    private String enumName;

    /** 枚举应用的表 */
    @ApiModelProperty(value = "枚举应用的表", position = 2)
    private String tableName;

    /** 该枚举应用的字段 */
    @ApiModelProperty(value = "该枚举应用的字段", position = 3)
    private String fieldsName;

    /** 数据状态：0启用;1禁用;2软删 */
    @ApiModelProperty(value = "数据状态：0启用;1禁用;2软删", position = 4)
    private Integer validStatus;

    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 5)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    /** 最后更新时间 */
    @ApiModelProperty(value = "最后更新时间", position = 6)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}