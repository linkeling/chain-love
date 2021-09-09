package com.match.making.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.match.making.BaseBizServiceImpl;
import com.match.making.biz.MeddiumLeadRecordBizService;
import com.match.making.param.output.MeddiumLeadRecordDTO;
import com.match.making.entity.MeddiumLeadRecord;
import com.match.making.param.query.MeddiumLeadRecordQueryVO;
import com.match.making.param.save.MeddiumLeadRecordSaveVO;
import com.match.making.service.MeddiumLeadRecordService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 红娘引入记录 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class MeddiumLeadRecordBizServiceImpl extends BaseBizServiceImpl<MeddiumLeadRecordSaveVO, MeddiumLeadRecordQueryVO, MeddiumLeadRecordDTO, MeddiumLeadRecord, MeddiumLeadRecordService> implements MeddiumLeadRecordBizService {
    @Override
    protected void setCriteriaForQuery(MeddiumLeadRecordQueryVO vo, QueryWrapper<MeddiumLeadRecord> criteria) {
        if(Objects.nonNull(vo.getMediumId())){
            criteria.eq("medium_id", vo.getMediumId());
        }
        if(Objects.nonNull(vo.getBeMediumId())){
            criteria.eq("be_medium_id", vo.getBeMediumId());
        }
        if(Objects.nonNull(vo.getLeadDate())){
            criteria.eq("lead_date", vo.getLeadDate());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}