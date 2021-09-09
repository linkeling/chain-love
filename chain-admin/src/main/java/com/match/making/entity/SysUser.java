package com.match.making.entity;
import java.util.Date;

import lombok.*;
import com.match.making.base.BizEntity;
/**
 * 用户表
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class SysUser extends BizEntity{
    /** 主键 */
    private Long id;
    /** 用户名(登录账号,比如如果是医生就是医生的身份证号) */
    private String userName;
    /** 密码 */
    private String password;
    /** 上次登录时间 */
    private Date lastLoginTime;
    /** 上次登录ip */
    private String lastLoginIp;
    /** 用户类型 1-单位 2-供应商 */
    private Integer userType;
    /** 关联的id 单位id和供应商id */
    private Long relationId;
    /** 是否可用 0 不可用 1可用 */
    private Integer valid;
    /** 角色id */
    private Long roleId;
    /** 联系人 */
    private String contacts;
    /** 联系电话 */
    private String contactsPhone;
    /** 创建人 */
    private Long createUser;
    /** 剩余积分 */
    private Integer integral;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}