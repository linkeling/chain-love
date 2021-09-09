package com.match.making.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.match.making.BaseBizServiceImpl;
import com.match.making.biz.SysEnumValueBizService;
import com.match.making.param.output.SysEnumValueDTO;
import com.match.making.entity.SysEnumValue;
import com.match.making.param.query.SysEnumValueQueryVO;
import com.match.making.param.save.SysEnumValueSaveVO;
import com.match.making.service.SysEnumValueService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 枚举值 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class SysEnumValueBizServiceImpl extends BaseBizServiceImpl<SysEnumValueSaveVO, SysEnumValueQueryVO, SysEnumValueDTO, SysEnumValue, SysEnumValueService> implements SysEnumValueBizService {
    @Override
    protected void setCriteriaForQuery(SysEnumValueQueryVO vo, QueryWrapper<SysEnumValue> criteria) {
        if(Objects.nonNull(vo.getParentId())){
            criteria.eq("parent_id", vo.getParentId());
        }
        if(Objects.nonNull(vo.getEnumId())){
            criteria.eq("enum_id", vo.getEnumId());
        }
        if(Objects.nonNull(vo.getEnumName())){
            criteria.eq("enum_name", vo.getEnumName());
        }
        if(Objects.nonNull(vo.getEnumName2())){
            criteria.eq("enum_name2", vo.getEnumName2());
        }
        if(Objects.nonNull(vo.getEnumValue())){
            criteria.eq("enum_value", vo.getEnumValue());
        }
        if(Objects.nonNull(vo.getFilterCondition())){
            criteria.eq("filter_condition", vo.getFilterCondition());
        }
        if(Objects.nonNull(vo.getDisplayOrder())){
            criteria.eq("display_order", vo.getDisplayOrder());
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
        if(Objects.nonNull(vo.getOldValue())){
            criteria.eq("old_value", vo.getOldValue());
        }
    }
}