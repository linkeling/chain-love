package com.ynmarry.chain.entity;
import java.util.Date;

import lombok.*;
import com.ynmarry.chain.base.BizEntity;
/**
 * 枚举信息
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Getter
@Setter
public class SysEnum extends BizEntity{
    /** id */
    private Long id;
    /** 枚举名称 */
    private String enumName;
    /** 枚举应用的表 */
    private String tableName;
    /** 该枚举应用的字段 */
    private String fieldsName;
    /** 数据状态：0启用;1禁用;2软删 */
    private Integer validStatus;
    /** 创建时间 */
    private Date created;
    /** 最后更新时间 */
    private Date updated;
}