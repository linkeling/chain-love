package com.match.making.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.match.making.BaseBizServiceImpl;
import com.match.making.biz.CustomerBaseInfoBizService;
import com.match.making.param.output.CustomerBaseInfoDTO;
import com.match.making.entity.CustomerBaseInfo;
import com.match.making.param.query.CustomerBaseInfoQueryVO;
import com.match.making.param.save.CustomerBaseInfoSaveVO;
import com.match.making.service.CustomerBaseInfoService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 客户基本信息表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class CustomerBaseInfoBizServiceImpl extends BaseBizServiceImpl<CustomerBaseInfoSaveVO, CustomerBaseInfoQueryVO, CustomerBaseInfoDTO, CustomerBaseInfo, CustomerBaseInfoService> implements CustomerBaseInfoBizService {
    @Override
    protected void setCriteriaForQuery(CustomerBaseInfoQueryVO vo, QueryWrapper<CustomerBaseInfo> criteria) {
        if(Objects.nonNull(vo.getMediumId())){
            criteria.eq("medium_id", vo.getMediumId());
        }
        if(Objects.nonNull(vo.getOrderId())){
            criteria.eq("order_id", vo.getOrderId());
        }
        if(Objects.nonNull(vo.getWechatNumber())){
            criteria.eq("wechat_number", vo.getWechatNumber());
        }
        if(Objects.nonNull(vo.getGender())){
            criteria.eq("gender", vo.getGender());
        }
        if(Objects.nonNull(vo.getBirthDate())){
            criteria.eq("birth_date", vo.getBirthDate());
        }
        if(Objects.nonNull(vo.getEducation())){
            criteria.eq("education", vo.getEducation());
        }
        if(Objects.nonNull(vo.getHeight())){
            criteria.eq("height", vo.getHeight());
        }
        if(Objects.nonNull(vo.getLivingPlace())){
            criteria.eq("living_place", vo.getLivingPlace());
        }
        if(Objects.nonNull(vo.getMarriage())){
            criteria.eq("marriage", vo.getMarriage());
        }
        if(Objects.nonNull(vo.getTrade())){
            criteria.eq("trade", vo.getTrade());
        }
        if(Objects.nonNull(vo.getProfession())){
            criteria.eq("profession", vo.getProfession());
        }
        if(Objects.nonNull(vo.getMonthIncome())){
            criteria.eq("month_income", vo.getMonthIncome());
        }
        if(Objects.nonNull(vo.getHouse())){
            criteria.eq("house", vo.getHouse());
        }
        if(Objects.nonNull(vo.getIsCar())){
            criteria.eq("is_car", vo.getIsCar());
        }
        if(Objects.nonNull(vo.getPersonal())){
            criteria.eq("personal", vo.getPersonal());
        }
        if(Objects.nonNull(vo.getStandard())){
            criteria.eq("standard", vo.getStandard());
        }
        if(Objects.nonNull(vo.getPictures())){
            criteria.eq("pictures", vo.getPictures());
        }
        if(Objects.nonNull(vo.getStatus())){
            criteria.eq("status", vo.getStatus());
        }
        if(Objects.nonNull(vo.getCreateDate())){
            criteria.eq("create_date", vo.getCreateDate());
        }
        if(Objects.nonNull(vo.getIsProtect())){
            criteria.eq("is_protect", vo.getIsProtect());
        }
        if(Objects.nonNull(vo.getLevel())){
            criteria.eq("level", vo.getLevel());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}