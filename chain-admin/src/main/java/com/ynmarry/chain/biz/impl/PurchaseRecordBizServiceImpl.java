package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.PurchaseRecordBizService;
import com.ynmarry.chain.param.output.PurchaseRecordDTO;
import com.ynmarry.chain.entity.PurchaseRecord;
import com.ynmarry.chain.param.query.PurchaseRecordQueryVO;
import com.ynmarry.chain.param.save.PurchaseRecordSaveVO;
import com.ynmarry.chain.service.PurchaseRecordService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 客户购买记录 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class PurchaseRecordBizServiceImpl extends BaseBizServiceImpl<PurchaseRecordSaveVO, PurchaseRecordQueryVO, PurchaseRecordDTO, PurchaseRecord, PurchaseRecordService> implements PurchaseRecordBizService {
    @Override
    protected void setCriteriaForQuery(PurchaseRecordQueryVO vo, QueryWrapper<PurchaseRecord> criteria) {
        if(Objects.nonNull(vo.getUserId())){
            criteria.eq("user_id", vo.getUserId());
        }
        if(Objects.nonNull(vo.getBePurchased())){
            criteria.eq("be_purchased", vo.getBePurchased());
        }
        if(Objects.nonNull(vo.getIntegral())){
            criteria.eq("integral", vo.getIntegral());
        }
        if(Objects.nonNull(vo.getCreateDate())){
            criteria.eq("create_date", vo.getCreateDate());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}