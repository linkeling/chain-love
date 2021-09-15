package com.ynmarry.chain.param.save;
import com.ynmarry.chain.base.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 枚举值VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "枚举值VO")
public class SysEnumValueSaveVO extends BaseVO {
    /** id */
    @ApiModelProperty(value = "" , required = true)
    @NotNull(message = "不能为空")
    private Long id;
    /** 父级ID，用于枚举值存在多级的情况 */
    @ApiModelProperty(value = "父级ID，用于枚举值存在多级的情况", position = 1 , required = true)
    @NotNull(message = "父级ID，用于枚举值存在多级的情况不能为空")
    private Long parentId;
    /** 枚举表id */
    @ApiModelProperty(value = "枚举表id", position = 2 , required = true)
    @NotNull(message = "枚举表id不能为空")
    private Long enumId;
    /** 枚举键名 */
    @ApiModelProperty(value = "枚举键名", position = 3 , required = true)
    @NotNull(message = "枚举键名不能为空")
    @Length(max=100, message = "枚举键名不能大于100")
    private String enumName;
    /** 枚举键名2 */
    @ApiModelProperty(value = "枚举键名2", position = 4 )
    @Length(max=100, message = "枚举键名2不能大于100")
    private String enumName2;
    /** 枚举值 */
    @ApiModelProperty(value = "枚举值", position = 5 , required = true)
    @NotNull(message = "枚举值不能为空")
    @Length(max=64, message = "枚举值不能大于64")
    private String enumValue;
    /** 过滤条件 */
    @ApiModelProperty(value = "过滤条件", position = 6 )
    @Length(max=64, message = "过滤条件不能大于64")
    private String filterCondition;
    /** 显示顺序 */
    @ApiModelProperty(value = "显示顺序", position = 7 , required = true)
    @NotNull(message = "显示顺序不能为空")
    private Integer displayOrder;
    /** 数据状态：0启用;1禁用;2软删 */
    @ApiModelProperty(value = "数据状态：0启用;1禁用;2软删", position = 8 , required = true)
    @NotNull(message = "数据状态：0启用;1禁用;2软删不能为空")
    private Integer validStatus;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 9 , required = true)
    @NotNull(message = "创建时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 10 , required = true)
    @NotNull(message = "更新时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
    /** 老版枚举值，新枚举，为空 */
    @ApiModelProperty(value = "老版枚举值，新枚举，为空", position = 11 )
    @Length(max=50, message = "老版枚举值，新枚举，为空不能大于50")
    private String oldValue;
}