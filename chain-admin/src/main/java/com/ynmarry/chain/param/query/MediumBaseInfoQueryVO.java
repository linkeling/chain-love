package com.ynmarry.chain.param.query;
import com.ynmarry.chain.base.PaginationVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询红娘基本信息表VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "查询红娘基本信息表VO")
public class MediumBaseInfoQueryVO extends PaginationVO{

    /** 主键id */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /** 父id */
    @ApiModelProperty(value = "父id", position = 1)
    private Long parentId;

    /** 红娘编号 */
    @ApiModelProperty(value = "红娘编号", position = 2)
    private String orderId;

    /** 姓名 */
    @ApiModelProperty(value = "姓名", position = 3)
    private String mediumName;

    /** 性别 */
    @ApiModelProperty(value = "性别", position = 4)
    private Integer gender;

    /** 证件号码 */
    @ApiModelProperty(value = "证件号码", position = 5)
    private String idCard;

    /** 联系电话 */
    @ApiModelProperty(value = "联系电话", position = 6)
    private String telphone;

    /** 红娘等级 */
    @ApiModelProperty(value = "红娘等级", position = 7)
    private Integer level;

    /** 加入时间 */
    @ApiModelProperty(value = "加入时间", position = 8)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /** 状态 0-待审核 1-已审核 2-作废 */
    @ApiModelProperty(value = "状态 0-待审核 1-已审核 2-作废", position = 9)
    private Integer status;

    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 10)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 11)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}