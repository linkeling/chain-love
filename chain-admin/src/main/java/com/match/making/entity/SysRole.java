package com.match.making.entity;
import java.util.Date;

import lombok.*;
import com.match.making.base.BizEntity;
/**
 * 系统管理-角色表 
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class SysRole extends BizEntity{
    /** 主键ID */
    private Long id;
    /** 角色编码 */
    private String roleCode;
    /** 角色名称 */
    private String roleName;
    /** 角色描述 */
    private String remarks;
    /** 添加时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}