package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.CustomerAttestationBizService;
import com.ynmarry.chain.param.output.CustomerAttestationDTO;
import com.ynmarry.chain.entity.CustomerAttestation;
import com.ynmarry.chain.param.query.CustomerAttestationQueryVO;
import com.ynmarry.chain.param.save.CustomerAttestationSaveVO;
import com.ynmarry.chain.service.CustomerAttestationService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 相亲资料认证表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class CustomerAttestationBizServiceImpl extends BaseBizServiceImpl<CustomerAttestationSaveVO, CustomerAttestationQueryVO, CustomerAttestationDTO, CustomerAttestation, CustomerAttestationService> implements CustomerAttestationBizService {
    @Override
    protected void setCriteriaForQuery(CustomerAttestationQueryVO vo, QueryWrapper<CustomerAttestation> criteria) {
        if(Objects.nonNull(vo.getCustomerId())){
            criteria.eq("customer_id", vo.getCustomerId());
        }
        if(Objects.nonNull(vo.getProfession())){
            criteria.eq("profession", vo.getProfession());
        }
        if(Objects.nonNull(vo.getHouse())){
            criteria.eq("house", vo.getHouse());
        }
        if(Objects.nonNull(vo.getIsCar())){
            criteria.eq("is_car", vo.getIsCar());
        }
        if(Objects.nonNull(vo.getEducation())){
            criteria.eq("education", vo.getEducation());
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