package com.ynmarry.chain.entity;
import java.util.Date;

import lombok.*;
import com.ynmarry.chain.base.BizEntity;
/**
 * 红娘基本信息表
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Getter
@Setter
public class MediumBaseInfo extends BizEntity{
    /** 主键id */
    private Long id;
    /** 父id */
    private Long parentId;
    /** 红娘编号 */
    private String orderId;
    /** 姓名 */
    private String mediumName;
    /** 性别 */
    private Integer gender;
    /** 证件号码 */
    private String idCard;
    /** 联系电话 */
    private String telphone;
    /** 红娘等级 */
    private Integer level;
    /** 加入时间 */
    private Date createDate;
    /** 状态 0-待审核 1-已审核 2-作废 */
    private Integer status;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}