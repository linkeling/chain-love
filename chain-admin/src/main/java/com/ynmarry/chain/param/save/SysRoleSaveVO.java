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
 * 系统管理-角色表 VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "系统管理-角色表 VO")
public class SysRoleSaveVO extends BaseVO {
    /** 主键ID */
    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不能为空")
    private Long id;
    /** 角色编码 */
    @ApiModelProperty(value = "角色编码", position = 1 )
    @Length(max=50, message = "角色编码不能大于50")
    private String roleCode;
    /** 角色名称 */
    @ApiModelProperty(value = "角色名称", position = 2 )
    @Length(max=50, message = "角色名称不能大于50")
    private String roleName;
    /** 角色描述 */
    @ApiModelProperty(value = "角色描述", position = 3 )
    @Length(max=500, message = "角色描述不能大于500")
    private String remarks;
    /** 添加时间 */
    @ApiModelProperty(value = "添加时间", position = 4 , required = true)
    @NotNull(message = "添加时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 5 , required = true)
    @NotNull(message = "更新时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}