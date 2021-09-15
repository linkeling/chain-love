package com.ynmarry.chain.entity;
import java.util.Date;

import lombok.*;
import com.ynmarry.chain.base.BizEntity;
/**
 * 相亲资料认证表
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Getter
@Setter
public class CustomerAttestation extends BizEntity{
    /** 主键id */
    private Long id;
    /** 客户id */
    private Long customerId;
    /** 职业 */
    private Long profession;
    /** 房产情况 */
    private Long house;
    /** 车辆情况 */
    private Long isCar;
    /** 学历 */
    private Long education;
    /** 是否认证 0-待认证 1-已经认证 */
    private Integer status;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}