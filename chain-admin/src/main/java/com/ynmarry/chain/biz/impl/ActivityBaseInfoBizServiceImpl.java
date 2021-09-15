package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.ActivityBaseInfoBizService;
import com.ynmarry.chain.param.output.ActivityBaseInfoDTO;
import com.ynmarry.chain.entity.ActivityBaseInfo;
import com.ynmarry.chain.param.query.ActivityBaseInfoQueryVO;
import com.ynmarry.chain.param.save.ActivityBaseInfoSaveVO;
import com.ynmarry.chain.service.ActivityBaseInfoService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 活动基本信息表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class ActivityBaseInfoBizServiceImpl extends BaseBizServiceImpl<ActivityBaseInfoSaveVO, ActivityBaseInfoQueryVO, ActivityBaseInfoDTO, ActivityBaseInfo, ActivityBaseInfoService> implements ActivityBaseInfoBizService {
    @Override
    protected void setCriteriaForQuery(ActivityBaseInfoQueryVO vo, QueryWrapper<ActivityBaseInfo> criteria) {
        if(Objects.nonNull(vo.getTitle())){
            criteria.eq("title", vo.getTitle());
        }
        if(Objects.nonNull(vo.getContent())){
            criteria.eq("content", vo.getContent());
        }
        if(Objects.nonNull(vo.getActivityDate())){
            criteria.eq("activity_date", vo.getActivityDate());
        }
        if(Objects.nonNull(vo.getFunds())){
            criteria.eq("funds", vo.getFunds());
        }
        if(Objects.nonNull(vo.getNotice())){
            criteria.eq("notice", vo.getNotice());
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