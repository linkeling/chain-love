package com.match.making.entity;
import java.util.Date;

import lombok.*;
import com.match.making.base.BizEntity;
/**
 * 地区字典
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class DictArea extends BizEntity{
    /** id */
    private Long id;
    /** 区域编码; 行政区划代码 */
    private String areaCode;
    /** 区域名称 */
    private String areaName;
    /** 别名 */
    private String alias;
    /** 区域全称 */
    private String fullName;
    /** 区域级别;1省级;2市级;3县级;4乡级;5村委会 */
    private Integer areaLevel;
    /** 父级编码 */
    private String parentCode;
    /** 外部系统编码对照 */
    private String externalSystemCode;
    /** 通用数据状态 0=正常 1=停用 2=软删 */
    private Integer status;
    /** created */
    private Date created;
    /** updated */
    private Date updated;
}