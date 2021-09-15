package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.PicturesInfoBizService;
import com.ynmarry.chain.param.output.PicturesInfoDTO;
import com.ynmarry.chain.entity.PicturesInfo;
import com.ynmarry.chain.param.query.PicturesInfoQueryVO;
import com.ynmarry.chain.param.save.PicturesInfoSaveVO;
import com.ynmarry.chain.service.PicturesInfoService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 附件资源日志 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class PicturesInfoBizServiceImpl extends BaseBizServiceImpl<PicturesInfoSaveVO, PicturesInfoQueryVO, PicturesInfoDTO, PicturesInfo, PicturesInfoService> implements PicturesInfoBizService {
    @Override
    protected void setCriteriaForQuery(PicturesInfoQueryVO vo, QueryWrapper<PicturesInfo> criteria) {
        if(Objects.nonNull(vo.getUuid())){
            criteria.eq("uuid", vo.getUuid());
        }
        if(Objects.nonNull(vo.getServerId())){
            criteria.eq("server_id", vo.getServerId());
        }
        if(Objects.nonNull(vo.getDownloadUrl())){
            criteria.eq("download_url", vo.getDownloadUrl());
        }
        if(Objects.nonNull(vo.getSize())){
            criteria.eq("size", vo.getSize());
        }
        if(Objects.nonNull(vo.getMd5Hash())){
            criteria.eq("md5_hash", vo.getMd5Hash());
        }
        if(Objects.nonNull(vo.getSha1Hash())){
            criteria.eq("sha1_hash", vo.getSha1Hash());
        }
        if(Objects.nonNull(vo.getFileName())){
            criteria.eq("file_name", vo.getFileName());
        }
        if(Objects.nonNull(vo.getFileType())){
            criteria.eq("file_type", vo.getFileType());
        }
        if(Objects.nonNull(vo.getParentId())){
            criteria.eq("parent_id", vo.getParentId());
        }
        if(Objects.nonNull(vo.getDescription())){
            criteria.eq("description", vo.getDescription());
        }
        if(Objects.nonNull(vo.getTags())){
            criteria.eq("tags", vo.getTags());
        }
        if(Objects.nonNull(vo.getValidStatus())){
            criteria.eq("valid_status", vo.getValidStatus());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}