package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.BusinessRecordBizService;
import com.ynmarry.chain.param.output.BusinessRecordDTO;
import com.ynmarry.chain.entity.BusinessRecord;
import com.ynmarry.chain.param.query.BusinessRecordQueryVO;
import com.ynmarry.chain.param.save.BusinessRecordSaveVO;
import com.ynmarry.chain.service.BusinessRecordService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 交易记录表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class BusinessRecordBizServiceImpl extends BaseBizServiceImpl<BusinessRecordSaveVO, BusinessRecordQueryVO, BusinessRecordDTO, BusinessRecord, BusinessRecordService> implements BusinessRecordBizService {
    @Override
    protected void setCriteriaForQuery(BusinessRecordQueryVO vo, QueryWrapper<BusinessRecord> criteria) {
        if(Objects.nonNull(vo.getUserId())){
            criteria.eq("user_id", vo.getUserId());
        }
        if(Objects.nonNull(vo.getType())){
            criteria.eq("type", vo.getType());
        }
        if(Objects.nonNull(vo.getPayMoney())){
            criteria.eq("pay_money", vo.getPayMoney());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}