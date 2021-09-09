package com.match.making.param.output;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.match.making.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 枚举值DTO
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "枚举值DTO")
public class SysEnumValueDTO extends BaseDTO {
    /** id */
    @ApiModelProperty(value = "")
    private Long id;
    /** 父级ID，用于枚举值存在多级的情况 */
    @ApiModelProperty(value = "父级ID，用于枚举值存在多级的情况", position = 1)
    private Long parentId;
    /** 枚举表id */
    @ApiModelProperty(value = "枚举表id", position = 2)
    private Long enumId;
    /** 枚举键名 */
    @ApiModelProperty(value = "枚举键名", position = 3)
    private String enumName;
    /** 枚举键名2 */
    @ApiModelProperty(value = "枚举键名2", position = 4)
    private String enumName2;
    /** 枚举值 */
    @ApiModelProperty(value = "枚举值", position = 5)
    private String enumValue;
    /** 过滤条件 */
    @ApiModelProperty(value = "过滤条件", position = 6)
    private String filterCondition;
    /** 显示顺序 */
    @ApiModelProperty(value = "显示顺序", position = 7)
    private Integer displayOrder;
    /** 数据状态：0启用;1禁用;2软删 */
    @ApiModelProperty(value = "数据状态：0启用;1禁用;2软删", position = 8)
    private Integer validStatus;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 9)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 10)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
    /** 老版枚举值，新枚举，为空 */
    @ApiModelProperty(value = "老版枚举值，新枚举，为空", position = 11)
    private String oldValue;
}