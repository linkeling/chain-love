package com.match.making.entity;
import java.util.Date;

import lombok.*;
import com.match.making.base.BizEntity;
/**
 * 枚举值
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class SysEnumValue extends BizEntity{
    /** id */
    private Long id;
    /** 父级ID，用于枚举值存在多级的情况 */
    private Long parentId;
    /** 枚举表id */
    private Long enumId;
    /** 枚举键名 */
    private String enumName;
    /** 枚举键名2 */
    private String enumName2;
    /** 枚举值 */
    private String enumValue;
    /** 过滤条件 */
    private String filterCondition;
    /** 显示顺序 */
    private Integer displayOrder;
    /** 数据状态：0启用;1禁用;2软删 */
    private Integer validStatus;
    /** 创建时间 */
    private Date created;
    /** 更新时间 */
    private Date updated;
    /** 老版枚举值，新枚举，为空 */
    private String oldValue;
}