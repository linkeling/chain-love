package com.ynmarry.chain.biz.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.CustomerLikeRecordBizService;
import com.ynmarry.chain.param.output.CustomerLikeRecordDTO;
import com.ynmarry.chain.entity.CustomerLikeRecord;
import com.ynmarry.chain.param.query.CustomerLikeRecordQueryVO;
import com.ynmarry.chain.param.save.CustomerLikeRecordSaveVO;
import com.ynmarry.chain.service.CustomerLikeRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * 用户喜欢记录 业务Service 实现类
 *
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class CustomerLikeRecordBizServiceImpl extends BaseBizServiceImpl<CustomerLikeRecordSaveVO, CustomerLikeRecordQueryVO, CustomerLikeRecordDTO, CustomerLikeRecord, CustomerLikeRecordService> implements CustomerLikeRecordBizService {
    @Override
    protected void setCriteriaForQuery(CustomerLikeRecordQueryVO vo, QueryWrapper<CustomerLikeRecord> criteria) {
        if (Objects.nonNull(vo.getUserId())) {
            criteria.eq("user_id", vo.getUserId());
        }
        if (Objects.nonNull(vo.getCustomerId())) {
            criteria.eq("customer_id", vo.getCustomerId());
        }
        if (Objects.nonNull(vo.getCustomerUserId())) {
            criteria.eq("customer_user_id", vo.getCustomerUserId());
        }
        if (Objects.nonNull(vo.getMessage())) {
            criteria.eq("message", vo.getMessage());
        }
        if (Objects.nonNull(vo.getStatus())) {
            criteria.eq("status", vo.getStatus());
        }
        if (Objects.nonNull(vo.getCreated())) {
            criteria.eq("created", vo.getCreated());
        }
        if (Objects.nonNull(vo.getUpdated())) {
            criteria.eq("updated", vo.getUpdated());
        }
    }

    @Override
    public List<CustomerLikeRecordDTO> queryByUserId(long userId) {
        List<CustomerLikeRecord> list = baseService.getByUserId(userId);
        List<CustomerLikeRecordDTO> dtoList = convertEntity2DtoList(list);
        return dtoList;
    }
}