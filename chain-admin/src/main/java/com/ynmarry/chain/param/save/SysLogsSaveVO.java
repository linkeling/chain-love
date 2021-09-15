package com.ynmarry.chain.param.save;
import com.ynmarry.chain.base.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统管理 - 日志表VO
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "系统管理 - 日志表VO")
public class SysLogsSaveVO extends BaseVO {
    /** 主键ID */
    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不能为空")
    private Long id;
    /** 接口名称 */
    @ApiModelProperty(value = "接口名称", position = 1 )
    @Length(max=100, message = "接口名称不能大于100")
    private String apiName;
    /** 接口地址 */
    @ApiModelProperty(value = "接口地址", position = 2 )
    @Length(max=255, message = "接口地址不能大于255")
    private String apiUrl;
    /** 访问人IP */
    @ApiModelProperty(value = "访问人IP", position = 3 )
    @Length(max=30, message = "访问人IP不能大于30")
    private String userIp;
    /** 访问人ID 0:未登录用户操作 */
    @ApiModelProperty(value = "访问人ID 0:未登录用户操作", position = 4 )
    private Integer userId;
    /** 访问状态 */
    @ApiModelProperty(value = "访问状态", position = 5 )
    private Integer status;
    /** 接口执行时间 */
    @ApiModelProperty(value = "接口执行时间", position = 6 )
    @Length(max=10, message = "接口执行时间不能大于10")
    private String executeTime;
    /** 添加时间 */
    @ApiModelProperty(value = "添加时间", position = 7 , required = true)
    @NotNull(message = "添加时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 更新时间 */
    @ApiModelProperty(value = "更新时间", position = 8 , required = true)
    @NotNull(message = "更新时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}