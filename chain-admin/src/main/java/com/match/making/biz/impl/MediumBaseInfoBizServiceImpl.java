package com.match.making.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.match.making.BaseBizServiceImpl;
import com.match.making.biz.MediumBaseInfoBizService;
import com.match.making.param.output.MediumBaseInfoDTO;
import com.match.making.entity.MediumBaseInfo;
import com.match.making.param.query.MediumBaseInfoQueryVO;
import com.match.making.param.save.MediumBaseInfoSaveVO;
import com.match.making.service.MediumBaseInfoService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 红娘基本信息表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class MediumBaseInfoBizServiceImpl extends BaseBizServiceImpl<MediumBaseInfoSaveVO, MediumBaseInfoQueryVO, MediumBaseInfoDTO, MediumBaseInfo, MediumBaseInfoService> implements MediumBaseInfoBizService {
    @Override
    protected void setCriteriaForQuery(MediumBaseInfoQueryVO vo, QueryWrapper<MediumBaseInfo> criteria) {
        if(Objects.nonNull(vo.getParentId())){
            criteria.eq("parent_id", vo.getParentId());
        }
        if(Objects.nonNull(vo.getOrderId())){
            criteria.eq("order_id", vo.getOrderId());
        }
        if(Objects.nonNull(vo.getMediumName())){
            criteria.eq("medium_name", vo.getMediumName());
        }
        if(Objects.nonNull(vo.getGender())){
            criteria.eq("gender", vo.getGender());
        }
        if(Objects.nonNull(vo.getIdCard())){
            criteria.eq("id_card", vo.getIdCard());
        }
        if(Objects.nonNull(vo.getTelphone())){
            criteria.eq("telphone", vo.getTelphone());
        }
        if(Objects.nonNull(vo.getLevel())){
            criteria.eq("level", vo.getLevel());
        }
        if(Objects.nonNull(vo.getCreateDate())){
            criteria.eq("create_date", vo.getCreateDate());
        }
        if(Objects.nonNull(vo.getStatus())){
            criteria.eq("status", vo.getStatus());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}