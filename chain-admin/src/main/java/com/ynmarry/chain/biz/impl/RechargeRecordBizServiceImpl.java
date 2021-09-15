package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.RechargeRecordBizService;
import com.ynmarry.chain.param.output.RechargeRecordDTO;
import com.ynmarry.chain.entity.RechargeRecord;
import com.ynmarry.chain.param.query.RechargeRecordQueryVO;
import com.ynmarry.chain.param.save.RechargeRecordSaveVO;
import com.ynmarry.chain.service.RechargeRecordService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 充值记录表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class RechargeRecordBizServiceImpl extends BaseBizServiceImpl<RechargeRecordSaveVO, RechargeRecordQueryVO, RechargeRecordDTO, RechargeRecord, RechargeRecordService> implements RechargeRecordBizService {
    @Override
    protected void setCriteriaForQuery(RechargeRecordQueryVO vo, QueryWrapper<RechargeRecord> criteria) {
        if(Objects.nonNull(vo.getUserId())){
            criteria.eq("user_id", vo.getUserId());
        }
        if(Objects.nonNull(vo.getCreateTime())){
            criteria.eq("create_time", vo.getCreateTime());
        }
        if(Objects.nonNull(vo.getPayNumber())){
            criteria.eq("pay_number", vo.getPayNumber());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}