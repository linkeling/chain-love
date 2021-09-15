package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.CustomerIntegralBizService;
import com.ynmarry.chain.param.output.CustomerIntegralDTO;
import com.ynmarry.chain.entity.CustomerIntegral;
import com.ynmarry.chain.param.query.CustomerIntegralQueryVO;
import com.ynmarry.chain.param.save.CustomerIntegralSaveVO;
import com.ynmarry.chain.service.CustomerIntegralService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 等级积分关系表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class CustomerIntegralBizServiceImpl extends BaseBizServiceImpl<CustomerIntegralSaveVO, CustomerIntegralQueryVO, CustomerIntegralDTO, CustomerIntegral, CustomerIntegralService> implements CustomerIntegralBizService {
    @Override
    protected void setCriteriaForQuery(CustomerIntegralQueryVO vo, QueryWrapper<CustomerIntegral> criteria) {
        if(Objects.nonNull(vo.getCustomerId())){
            criteria.eq("customer_id", vo.getCustomerId());
        }
        if(Objects.nonNull(vo.getIntegral())){
            criteria.eq("integral", vo.getIntegral());
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