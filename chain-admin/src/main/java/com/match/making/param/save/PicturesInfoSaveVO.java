package com.match.making.param.save;
import com.match.making.base.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 附件资源日志VO
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ApiModel(description = "附件资源日志VO")
public class PicturesInfoSaveVO extends BaseVO {
    /** 自增ID */
    @ApiModelProperty(value = "自增ID" , required = true)
    @NotNull(message = "自增ID不能为空")
    private Long id;
    /** UUID标识符 */
    @ApiModelProperty(value = "UUID标识符", position = 1 )
    @Length(max=64, message = "UUID标识符不能大于64")
    private String uuid;
    /** 服务器编号(1:七牛,2:华为云) */
    @ApiModelProperty(value = "服务器编号(1:七牛,2:华为云)", position = 2 )
    private Integer serverId;
    /** 相对路径 */
    @ApiModelProperty(value = "相对路径", position = 3 , required = true)
    @NotNull(message = "相对路径不能为空")
    @Length(max=256, message = "相对路径不能大于256")
    private String downloadUrl;
    /** 文件大小 */
    @ApiModelProperty(value = "文件大小", position = 4 , required = true)
    @NotNull(message = "文件大小不能为空")
    private Integer size;
    /** MD5_Hash值 */
    @ApiModelProperty(value = "MD5_Hash值", position = 5 )
    @Length(max=32, message = "MD5_Hash值不能大于32")
    private String md5Hash;
    /** sha1_hash值 */
    @ApiModelProperty(value = "sha1_hash值", position = 6 )
    @Length(max=64, message = "sha1_hash值不能大于64")
    private String sha1Hash;
    /** 原始文件名 */
    @ApiModelProperty(value = "原始文件名", position = 7 )
    @Length(max=200, message = "原始文件名不能大于200")
    private String fileName;
    /** 文件类型,字符串 */
    @ApiModelProperty(value = "文件类型,字符串", position = 8 )
    @Length(max=32, message = "文件类型,字符串不能大于32")
    private String fileType;
    /** parentId */
    @ApiModelProperty(value = "", position = 9 )
    @Length(max=36, message = "不能大于36")
    private String parentId;
    /** 描述信息 */
    @ApiModelProperty(value = "描述信息", position = 10 )
    @Length(max=256, message = "描述信息不能大于256")
    private String description;
    /** 文件后缀 */
    @ApiModelProperty(value = "文件后缀", position = 11 )
    @Length(max=20, message = "文件后缀不能大于20")
    private String tags;
    /** 数据状态：0启用;1禁用;2软删 */
    @ApiModelProperty(value = "数据状态：0启用;1禁用;2软删", position = 12 , required = true)
    @NotNull(message = "数据状态：0启用;1禁用;2软删不能为空")
    private Integer validStatus;
    /** 创建时间 */
    @ApiModelProperty(value = "创建时间", position = 13 , required = true)
    @NotNull(message = "创建时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    /** 修改时间 */
    @ApiModelProperty(value = "修改时间", position = 14 , required = true)
    @NotNull(message = "修改时间不能为空")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updated;
}