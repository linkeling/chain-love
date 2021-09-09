package com.match.making.entity;
import java.util.Date;
import java.math.BigDecimal;

import com.match.making.base.BizEntity;
import lombok.*;

/**
 * 活动基本信息表
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class ActivityBaseInfo extends BizEntity {
    /** 主键id */
    private Long id;
    /** 标题 */
    private String title;
    /** 活动内容 */
    private String content;
    /** 活动时间 */
    private Date activityDate;
    /** 活动费用 */
    private BigDecimal funds;
    /** 活动须知 */
    private String notice;
    /** 活动状态 1-进行中 2-已完成 3-作废  */
    private Integer status;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}