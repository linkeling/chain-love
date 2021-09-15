package com.ynmarry.chain.entity;
import java.util.Date;
import java.math.BigDecimal;
import lombok.*;
import com.ynmarry.chain.base.BizEntity;
/**
 * 充值记录表
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Getter
@Setter
public class RechargeRecord extends BizEntity{
    /** 主键id */
    private Long id;
    /** 用户id */
    private Long userId;
    /** 充值时间 */
    private Date createTime;
    /** 充值金额 */
    private BigDecimal payNumber;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}