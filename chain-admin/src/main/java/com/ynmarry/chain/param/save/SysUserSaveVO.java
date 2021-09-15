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
 * 用户表VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "用户表VO")
public class SysUserSaveVO extends BaseVO {
    /** 主键 */
    @ApiModelProperty(value = "主键" , required = true)
    @NotNull(message = "主键不能为空")
    private Long id;
    /** 用户名(登录账号,比如如果是医生就是医生的身份证号) */
    @ApiModelProperty(value = "用户名(登录账号,比如如果是医生就是医生的身份证号)", position = 1 , required = true)
    @NotNull(message = "用户名(登录账号,比如如果是医生就是医生的身份证号)不能为空")
    @Length(max=64, message = "用户名(登录账号,比如如果是医生就是医生的身份证号)不能大于64")
    private String userName;
    /** 密码 */
    @ApiModelProperty(value = "密码", position = 2 , required = true)
    @NotNull(message = "密码不能为空")
    @Length(max=200, message = "密码不能大于200")
    private String password;
    /** 上次登录时间 */
    @ApiModelProperty(value = "上次登录时间", position = 3 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;
    /** 上次登录ip */
    @ApiModelProperty(value = "上次登录ip", position = 4 )
    @Length(max=64, message = "上次登录ip不能大于64")
    private String lastLoginIp;
    /** 用户类型 1-单位 2-供应商 */
    @ApiModelProperty(value = "用户类型 1-单位 2-供应商", position = 5 )
    private Integer userType;
    /** 关联的id 单位id和供应商id */
    @ApiModelProperty(value = "关联的id 单位id和供应商id", position = 6 )
    private Long relationId;
    /** 是否可用 0 不可用 1可用 */
    @ApiModelProperty(value = "是否可用 0 不可用 1可用", position = 7 )
    private Integer valid;
    /** 角色id */
    @ApiModelProperty(value = "角色id", position = 8 )
    private Long roleId;
    /** 联系人 */
    @ApiModelProperty(value = "联系人", position = 9 )
    @Length(max=255, message = "联系人不能大于255")
    private String contacts;
    /** 联系电话 */
    @ApiModelProperty(value = "联系电话", position = 10 )
    @Length(max=255, message = "联系电话不能大于255")
    private String contactsPhone;
    /** 创建人 */
    @ApiModelProperty(value = "创建人", position = 11 )
    private Long createUser;
    /** 剩余积分 */
    @ApiModelProperty(value = "剩余积分", position = 12 )
    private Integer integral;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 13 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 14 )
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}