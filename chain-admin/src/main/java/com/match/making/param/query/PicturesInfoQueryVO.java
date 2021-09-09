package com.match.making.param.query;
import com.match.making.base.PaginationVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询附件资源日志VO
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "查询附件资源日志VO")
public class PicturesInfoQueryVO extends PaginationVO{

    /** 自增ID */
    @ApiModelProperty(value = "自增ID")
    private Long id;

    /** UUID标识符 */
    @ApiModelProperty(value = "UUID标识符", position = 1)
    private String uuid;

    /** 服务器编号(1:七牛,2:华为云) */
    @ApiModelProperty(value = "服务器编号(1:七牛,2:华为云)", position = 2)
    private Integer serverId;

    /** 相对路径 */
    @ApiModelProperty(value = "相对路径", position = 3)
    private String downloadUrl;

    /** 文件大小 */
    @ApiModelProperty(value = "文件大小", position = 4)
    private Integer size;

    /** MD5_Hash值 */
    @ApiModelProperty(value = "MD5_Hash值", position = 5)
    private String md5Hash;

    /** sha1_hash值 */
    @ApiModelProperty(value = "sha1_hash值", position = 6)
    private String sha1Hash;

    /** 原始文件名 */
    @ApiModelProperty(value = "原始文件名", position = 7)
    private String fileName;

    /** 文件类型,字符串 */
    @ApiModelProperty(value = "文件类型,字符串", position = 8)
    private String fileType;

    /** parentId */
    @ApiModelProperty(value = "", position = 9)
    private String parentId;

    /** 描述信息 */
    @ApiModelProperty(value = "描述信息", position = 10)
    private String description;

    /** 文件后缀 */
    @ApiModelProperty(value = "文件后缀", position = 11)
    private String tags;

    /** 数据状态：0启用;1禁用;2软删 */
    @ApiModelProperty(value = "数据状态：0启用;1禁用;2软删", position = 12)
    private Integer validStatus;

    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 13)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;

    /** 修改时间 */
    @ApiModelProperty(value = "修改时间", position = 14)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}