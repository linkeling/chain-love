package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.ActivityEnterInfoBizService;
import com.ynmarry.chain.param.output.ActivityEnterInfoDTO;
import com.ynmarry.chain.entity.ActivityEnterInfo;
import com.ynmarry.chain.param.query.ActivityEnterInfoQueryVO;
import com.ynmarry.chain.param.save.ActivityEnterInfoSaveVO;
import com.ynmarry.chain.service.ActivityEnterInfoService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 活动报名信息表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class ActivityEnterInfoBizServiceImpl extends BaseBizServiceImpl<ActivityEnterInfoSaveVO, ActivityEnterInfoQueryVO, ActivityEnterInfoDTO, ActivityEnterInfo, ActivityEnterInfoService> implements ActivityEnterInfoBizService {
    @Override
    protected void setCriteriaForQuery(ActivityEnterInfoQueryVO vo, QueryWrapper<ActivityEnterInfo> criteria) {
        if(Objects.nonNull(vo.getAcivityId())){
            criteria.eq("acivity_id", vo.getAcivityId());
        }
        if(Objects.nonNull(vo.getCustomerId())){
            criteria.eq("customer_id", vo.getCustomerId());
        }
        if(Objects.nonNull(vo.getTelphone())){
            criteria.eq("telphone", vo.getTelphone());
        }
        if(Objects.nonNull(vo.getCustomerName())){
            criteria.eq("customer_name", vo.getCustomerName());
        }
        if(Objects.nonNull(vo.getPayStatus())){
            criteria.eq("pay_status", vo.getPayStatus());
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