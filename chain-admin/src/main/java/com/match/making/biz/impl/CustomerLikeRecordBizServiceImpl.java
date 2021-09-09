package com.match.making.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.match.making.BaseBizServiceImpl;
import com.match.making.biz.CustomerLikeRecordBizService;
import com.match.making.param.output.CustomerLikeRecordDTO;
import com.match.making.entity.CustomerLikeRecord;
import com.match.making.param.query.CustomerLikeRecordQueryVO;
import com.match.making.param.save.CustomerLikeRecordSaveVO;
import com.match.making.service.CustomerLikeRecordService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 用户喜欢记录 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class CustomerLikeRecordBizServiceImpl extends BaseBizServiceImpl<CustomerLikeRecordSaveVO, CustomerLikeRecordQueryVO, CustomerLikeRecordDTO, CustomerLikeRecord, CustomerLikeRecordService> implements CustomerLikeRecordBizService {
    @Override
    protected void setCriteriaForQuery(CustomerLikeRecordQueryVO vo, QueryWrapper<CustomerLikeRecord> criteria) {
        if(Objects.nonNull(vo.getUserId())){
            criteria.eq("user_id", vo.getUserId());
        }
        if(Objects.nonNull(vo.getCustomerId())){
            criteria.eq("customer_id", vo.getCustomerId());
        }
        if(Objects.nonNull(vo.getCustomerUserId())){
            criteria.eq("customer_user_id", vo.getCustomerUserId());
        }
        if(Objects.nonNull(vo.getMessage())){
            criteria.eq("message", vo.getMessage());
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