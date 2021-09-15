package com.ynmarry.chain.param.output;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.ynmarry.chain.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 客户基本信息表DTO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "客户基本信息表DTO")
public class CustomerBaseInfoDTO extends BaseDTO {
    /** 主键id */
    @ApiModelProperty(value = "主键id")
    private Long id;
    /** 红娘id */
    @ApiModelProperty(value = "红娘id", position = 1)
    private Long mediumId;
    /** 用户id */
    @ApiModelProperty(value = "用户id", position = 2)
    private String orderId;
    /** 微信号 */
    @ApiModelProperty(value = "微信号", position = 3)
    private String wechatNumber;
    /** 性别 */
    @ApiModelProperty(value = "性别", position = 4)
    private Integer gender;
    /** 生日 */
    @ApiModelProperty(value = "生日", position = 5)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthDate;
    /** 学历 */
    @ApiModelProperty(value = "学历", position = 6)
    private Integer education;
    /** 身高 */
    @ApiModelProperty(value = "身高", position = 7)
    private Integer height;
    /** 现居地 */
    @ApiModelProperty(value = "现居地", position = 8)
    private String livingPlace;
    /** 婚史 */
    @ApiModelProperty(value = "婚史", position = 9)
    private Integer marriage;
    /** 行业 */
    @ApiModelProperty(value = "行业", position = 10)
    private Integer trade;
    /** 职业 */
    @ApiModelProperty(value = "职业", position = 11)
    private String profession;
    /** 月收入 */
    @ApiModelProperty(value = "月收入", position = 12)
    private Integer monthIncome;
    /** 房产情况 */
    @ApiModelProperty(value = "房产情况", position = 13)
    private Integer house;
    /** 车辆情况 */
    @ApiModelProperty(value = "车辆情况", position = 14)
    private Integer isCar;
    /** 个人介绍 */
    @ApiModelProperty(value = "个人介绍", position = 15)
    private String personal;
    /** 心仪的ta */
    @ApiModelProperty(value = "心仪的ta", position = 16)
    private String standard;
    /** 照片信息集合 */
    @ApiModelProperty(value = "照片信息集合", position = 17)
    private String pictures;
    /** 状态 0-待审核 1-通过 2-下架 */
    @ApiModelProperty(value = "状态 0-待审核 1-通过 2-下架", position = 18)
    private Integer status;
    /** 进入系统时间 */
    @ApiModelProperty(value = "进入系统时间", position = 19)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
    /** 是否申请保护 */
    @ApiModelProperty(value = "是否申请保护", position = 20)
    private Integer isProtect;
    /** 登记 1-非常 2-优质 3-中等 4-普通 */
    @ApiModelProperty(value = "登记 1-非常 2-优质 3-中等 4-普通", position = 21)
    private Integer level;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 22)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 23)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}