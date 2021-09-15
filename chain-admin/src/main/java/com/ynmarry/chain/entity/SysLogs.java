package com.ynmarry.chain.entity;
import java.util.Date;

import lombok.*;
import com.ynmarry.chain.base.BizEntity;
/**
 * 系统管理 - 日志表
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Getter
@Setter
public class SysLogs extends BizEntity{
    /** 主键ID */
    private Long id;
    /** 接口名称 */
    private String apiName;
    /** 接口地址 */
    private String apiUrl;
    /** 访问人IP */
    private String userIp;
    /** 访问人ID 0:未登录用户操作 */
    private Integer userId;
    /** 访问状态 */
    private Integer status;
    /** 接口执行时间 */
    private String executeTime;
    /** 添加时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}