package com.match.making.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.match.making.BaseBizServiceImpl;
import com.match.making.biz.SysEnumBizService;
import com.match.making.param.output.SysEnumDTO;
import com.match.making.entity.SysEnum;
import com.match.making.param.query.SysEnumQueryVO;
import com.match.making.param.save.SysEnumSaveVO;
import com.match.making.service.SysEnumService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 枚举信息 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class SysEnumBizServiceImpl extends BaseBizServiceImpl<SysEnumSaveVO, SysEnumQueryVO, SysEnumDTO, SysEnum, SysEnumService> implements SysEnumBizService {
    @Override
    protected void setCriteriaForQuery(SysEnumQueryVO vo, QueryWrapper<SysEnum> criteria) {
        if(Objects.nonNull(vo.getEnumName())){
            criteria.eq("enum_name", vo.getEnumName());
        }
        if(Objects.nonNull(vo.getTableName())){
            criteria.eq("table_name", vo.getTableName());
        }
        if(Objects.nonNull(vo.getFieldsName())){
            criteria.eq("fields_name", vo.getFieldsName());
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