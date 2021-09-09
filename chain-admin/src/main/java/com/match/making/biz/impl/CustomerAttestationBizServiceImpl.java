package com.match.making.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.match.making.BaseBizServiceImpl;
import com.match.making.biz.CustomerAttestationBizService;
import com.match.making.param.output.CustomerAttestationDTO;
import com.match.making.entity.CustomerAttestation;
import com.match.making.param.query.CustomerAttestationQueryVO;
import com.match.making.param.save.CustomerAttestationSaveVO;
import com.match.making.service.CustomerAttestationService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 相亲资料认证表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
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