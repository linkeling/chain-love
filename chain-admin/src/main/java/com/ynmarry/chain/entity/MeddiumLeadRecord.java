package com.ynmarry.chain.entity;
import java.util.Date;

import lombok.*;
import com.ynmarry.chain.base.BizEntity;
/**
 * 红娘引入记录
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Getter
@Setter
public class MeddiumLeadRecord extends BizEntity{
    /** 主键id */
    private Long id;
    /** 红娘id */
    private Long mediumId;
    /** 被引入红娘id */
    private Long beMediumId;
    /** 引入时间 */
    private Date leadDate;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
}