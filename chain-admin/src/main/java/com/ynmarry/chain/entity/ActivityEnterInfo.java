package com.ynmarry.chain.entity;
import java.util.Date;
import java.math.BigDecimal;
import lombok.*;
import com.ynmarry.chain.base.BizEntity;
/**
 * 活动报名信息表
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Getter
@Setter
public class ActivityEnterInfo extends BizEntity{
    /** 主键id */
    private Long id;
    /** 活动id */
    private Long acivityId;
    /** 客户id */
    private Long customerId;
    /** 联系电话 */
    private String telphone;
    /** 客户姓名 */
    private String customerName;
    /** 缴费状态 0-未缴费 1-已缴费 2-已退款 */
    private Integer payStatus;
    /** 缴费金额 */
    private BigDecimal payNumber;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}