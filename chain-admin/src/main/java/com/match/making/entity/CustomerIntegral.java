package com.match.making.entity;
import java.util.Date;

import lombok.*;
import com.match.making.base.BizEntity;
/**
 * 等级积分关系表
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class CustomerIntegral extends BizEntity{
    /** 主键id */
    private Long id;
    /** 客户等级 */
    private Integer customerId;
    /** 积分 */
    private Integer integral;
    /** 状态 0-无效 1-有效 */
    private Integer status;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}