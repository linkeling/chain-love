package com.match.making.entity;
import java.util.Date;

import lombok.*;
import com.match.making.base.BizEntity;
/**
 * 附件资源日志
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Getter
@Setter
public class PicturesInfo extends BizEntity{
    /** 自增ID */
    private Long id;
    /** UUID标识符 */
    private String uuid;
    /** 服务器编号(1:七牛,2:华为云) */
    private Integer serverId;
    /** 相对路径 */
    private String downloadUrl;
    /** 文件大小 */
    private Integer size;
    /** MD5_Hash值 */
    private String md5Hash;
    /** sha1_hash值 */
    private String sha1Hash;
    /** 原始文件名 */
    private String fileName;
    /** 文件类型,字符串 */
    private String fileType;
    /** parentId */
    private String parentId;
    /** 描述信息 */
    private String description;
    /** 文件后缀 */
    private String tags;
    /** 数据状态：0启用;1禁用;2软删 */
    private Integer validStatus;
    /** 创建时间 */
    private Date created;
    /** 修改时间 */
    private Date updated;
}