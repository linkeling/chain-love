package com.ynmarry.chain.param.query;
import com.ynmarry.chain.base.PaginationVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询系统管理 - 日志表VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "查询系统管理 - 日志表VO")
public class SysLogsQueryVO extends PaginationVO{

    /** 主键ID */
    @ApiModelProperty(value = "主键ID")
    private Long id;

    /** 接口名称 */
    @ApiModelProperty(value = "接口名称", position = 1)
    private String apiName;

    /** 接口地址 */
    @ApiModelProperty(value = "接口地址", position = 2)
    private String apiUrl;

    /** 访问人IP */
    @ApiModelProperty(value = "访问人IP", position = 3)
    private String userIp;

    /** 访问人ID 0:未登录用户操作 */
    @ApiModelProperty(value = "访问人ID 0:未登录用户操作", position = 4)
    private Integer userId;

    /** 访问状态 */
    @ApiModelProperty(value = "访问状态", position = 5)
    private Integer status;

    /** 接口执行时间 */
    @ApiModelProperty(value = "接口执行时间", position = 6)
    private String executeTime;

    /** 添加时间 */
    @ApiModelProperty(value = "添加时间", position = 7)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 8)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}