package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.DictAreaBizService;
import com.ynmarry.chain.param.output.DictAreaDTO;
import com.ynmarry.chain.entity.DictArea;
import com.ynmarry.chain.param.query.DictAreaQueryVO;
import com.ynmarry.chain.param.save.DictAreaSaveVO;
import com.ynmarry.chain.service.DictAreaService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 地区字典 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class DictAreaBizServiceImpl extends BaseBizServiceImpl<DictAreaSaveVO, DictAreaQueryVO, DictAreaDTO, DictArea, DictAreaService> implements DictAreaBizService {
    @Override
    protected void setCriteriaForQuery(DictAreaQueryVO vo, QueryWrapper<DictArea> criteria) {
        if(Objects.nonNull(vo.getAreaCode())){
            criteria.eq("area_code", vo.getAreaCode());
        }
        if(Objects.nonNull(vo.getAreaName())){
            criteria.eq("area_name", vo.getAreaName());
        }
        if(Objects.nonNull(vo.getAlias())){
            criteria.eq("alias", vo.getAlias());
        }
        if(Objects.nonNull(vo.getFullName())){
            criteria.eq("full_name", vo.getFullName());
        }
        if(Objects.nonNull(vo.getAreaLevel())){
            criteria.eq("area_level", vo.getAreaLevel());
        }
        if(Objects.nonNull(vo.getParentCode())){
            criteria.eq("parent_code", vo.getParentCode());
        }
        if(Objects.nonNull(vo.getExternalSystemCode())){
            criteria.eq("external_system_code", vo.getExternalSystemCode());
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