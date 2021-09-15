package com.ynmarry.chain.param.query;
import com.ynmarry.chain.base.PaginationVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询用户表VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "查询用户表VO")
public class SysUserQueryVO extends PaginationVO{

    /** 主键 */
    @ApiModelProperty(value = "主键")
    private Long id;

    /** 用户名(登录账号,比如如果是医生就是医生的身份证号) */
    @ApiModelProperty(value = "用户名(登录账号,比如如果是医生就是医生的身份证号)", position = 1)
    private String userName;

    /** 密码 */
    @ApiModelProperty(value = "密码", position = 2)
    private String password;

    /** 上次登录时间 */
    @ApiModelProperty(value = "上次登录时间", position = 3)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    /** 上次登录ip */
    @ApiModelProperty(value = "上次登录ip", position = 4)
    private String lastLoginIp;

    /** 用户类型 1-单位 2-供应商 */
    @ApiModelProperty(value = "用户类型 1-单位 2-供应商", position = 5)
    private Integer userType;

    /** 关联的id 单位id和供应商id */
    @ApiModelProperty(value = "关联的id 单位id和供应商id", position = 6)
    private Long relationId;

    /** 是否可用 0 不可用 1可用 */
    @ApiModelProperty(value = "是否可用 0 不可用 1可用", position = 7)
    private Integer valid;

    /** 角色id */
    @ApiModelProperty(value = "角色id", position = 8)
    private Long roleId;

    /** 联系人 */
    @ApiModelProperty(value = "联系人", position = 9)
    private String contacts;

    /** 联系电话 */
    @ApiModelProperty(value = "联系电话", position = 10)
    private String contactsPhone;

    /** 创建人 */
    @ApiModelProperty(value = "创建人", position = 11)
    private Long createUser;

    /** 剩余积分 */
    @ApiModelProperty(value = "剩余积分", position = 12)
    private Integer integral;

    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 13)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 14)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}