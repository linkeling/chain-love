package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.SysLogsBizService;
import com.ynmarry.chain.param.output.SysLogsDTO;
import com.ynmarry.chain.entity.SysLogs;
import com.ynmarry.chain.param.query.SysLogsQueryVO;
import com.ynmarry.chain.param.save.SysLogsSaveVO;
import com.ynmarry.chain.service.SysLogsService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 系统管理 - 日志表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class SysLogsBizServiceImpl extends BaseBizServiceImpl<SysLogsSaveVO, SysLogsQueryVO, SysLogsDTO, SysLogs, SysLogsService> implements SysLogsBizService {
    @Override
    protected void setCriteriaForQuery(SysLogsQueryVO vo, QueryWrapper<SysLogs> criteria) {
        if(Objects.nonNull(vo.getApiName())){
            criteria.eq("api_name", vo.getApiName());
        }
        if(Objects.nonNull(vo.getApiUrl())){
            criteria.eq("api_url", vo.getApiUrl());
        }
        if(Objects.nonNull(vo.getUserIp())){
            criteria.eq("user_ip", vo.getUserIp());
        }
        if(Objects.nonNull(vo.getUserId())){
            criteria.eq("user_id", vo.getUserId());
        }
        if(Objects.nonNull(vo.getStatus())){
            criteria.eq("status", vo.getStatus());
        }
        if(Objects.nonNull(vo.getExecuteTime())){
            criteria.eq("execute_time", vo.getExecuteTime());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}