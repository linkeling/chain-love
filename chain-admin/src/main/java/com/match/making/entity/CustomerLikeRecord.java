package com.match.making.entity;
import java.util.Date;

import lombok.*;
import com.match.making.base.BizEntity;
/**
 * 用户喜欢记录
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class CustomerLikeRecord extends BizEntity{
    /** 主键id */
    private Long id;
    /** 用户id */
    private Long userId;
    /** 被喜欢客户id */
    private Long customerId;
    /** 被喜欢用户id */
    private Long customerUserId;
    /** 喜欢留言 */
    private String message;
    /** 0-作废 1-有效 */
    private Integer status;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}