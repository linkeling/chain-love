package com.ynmarry.chain.param.query;
import com.ynmarry.chain.base.PaginationVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询系统管理-角色表 VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "查询系统管理-角色表 VO")
public class SysRoleQueryVO extends PaginationVO{

    /** 主键ID */
    @ApiModelProperty(value = "主键ID")
    private Long id;

    /** 角色编码 */
    @ApiModelProperty(value = "角色编码", position = 1)
    private String roleCode;

    /** 角色名称 */
    @ApiModelProperty(value = "角色名称", position = 2)
    private String roleName;

    /** 角色描述 */
    @ApiModelProperty(value = "角色描述", position = 3)
    private String remarks;

    /** 添加时间 */
    @ApiModelProperty(value = "添加时间", position = 4)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 5)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}