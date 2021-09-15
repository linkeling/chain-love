package com.ynmarry.chain.entity;
import java.util.Date;

import lombok.*;
import com.ynmarry.chain.base.BizEntity;
/**
 * 客户基本信息表
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Getter
@Setter
public class CustomerBaseInfo extends BizEntity{
    /** 主键id */
    private Long id;
    /** 红娘id */
    private Long mediumId;
    /** 用户id */
    private String orderId;
    /** 微信号 */
    private String wechatNumber;
    /** 性别 */
    private Integer gender;
    /** 生日 */
    private Date birthDate;
    /** 学历 */
    private Integer education;
    /** 身高 */
    private Integer height;
    /** 现居地 */
    private String livingPlace;
    /** 婚史 */
    private Integer marriage;
    /** 行业 */
    private Integer trade;
    /** 职业 */
    private String profession;
    /** 月收入 */
    private Integer monthIncome;
    /** 房产情况 */
    private Integer house;
    /** 车辆情况 */
    private Integer isCar;
    /** 个人介绍 */
    private String personal;
    /** 心仪的ta */
    private String standard;
    /** 照片信息集合 */
    private String pictures;
    /** 状态 0-待审核 1-通过 2-下架 */
    private Integer status;
    /** 进入系统时间 */
    private Date createDate;
    /** 是否申请保护 */
    private Integer isProtect;
    /** 登记 1-非常 2-优质 3-中等 4-普通 */
    private Integer level;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}