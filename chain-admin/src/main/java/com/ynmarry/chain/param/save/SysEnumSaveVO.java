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
 * 枚举信息VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "枚举信息VO")
public class SysEnumSaveVO extends BaseVO {
    /** id */
    @ApiModelProperty(value = "" , required = true)
    @NotNull(message = "不能为空")
    private Long id;
    /** 枚举名称 */
    @ApiModelProperty(value = "枚举名称", position = 1 , required = true)
    @NotNull(message = "枚举名称不能为空")
    @Length(max=50, message = "枚举名称不能大于50")
    private String enumName;
    /** 枚举应用的表 */
    @ApiModelProperty(value = "枚举应用的表", position = 2 , required = true)
    @NotNull(message = "枚举应用的表不能为空")
    @Length(max=50, message = "枚举应用的表不能大于50")
    private String tableName;
    /** 该枚举应用的字段 */
    @ApiModelProperty(value = "该枚举应用的字段", position = 3 , required = true)
    @NotNull(message = "该枚举应用的字段不能为空")
    @Length(max=50, message = "该枚举应用的字段不能大于50")
    private String fieldsName;
    /** 数据状态：0启用;1禁用;2软删 */
    @ApiModelProperty(value = "数据状态：0启用;1禁用;2软删", position = 4 , required = true)
    @NotNull(message = "数据状态：0启用;1禁用;2软删不能为空")
    private Integer validStatus;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 5 , required = true)
    @NotNull(message = "创建时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 最后更新时间 */
    @ApiModelProperty(value = "最后更新时间", position = 6 , required = true)
    @NotNull(message = "最后更新时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}