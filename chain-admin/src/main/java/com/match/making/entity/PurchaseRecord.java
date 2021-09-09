package com.match.making.entity;
import java.util.Date;

import lombok.*;
import com.match.making.base.BizEntity;
/**
 * 客户购买记录
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class PurchaseRecord extends BizEntity{
    /** 主键id */
    private Long id;
    /** 用户id */
    private Long userId;
    /** 被购买用户id */
    private Long bePurchased;
    /** 消费积分 */
    private Integer integral;
    /** 消费时间 */
    private Date createDate;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}