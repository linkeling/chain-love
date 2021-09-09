package com.match.making.entity;
import java.util.Date;
import java.math.BigDecimal;
import lombok.*;
import com.match.making.base.BizEntity;
/**
 * 交易记录表
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class BusinessRecord extends BizEntity{
    /** 主键id */
    private Long id;
    /** 用户id */
    private Long userId;
    /** 类型 1-充值 2-活动报名 */
    private Integer type;
    /** 充值金额 */
    private BigDecimal payMoney;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}