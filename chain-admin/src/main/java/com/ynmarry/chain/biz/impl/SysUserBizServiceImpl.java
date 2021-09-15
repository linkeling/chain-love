package com.ynmarry.chain.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynmarry.chain.BaseBizServiceImpl;
import com.ynmarry.chain.biz.SysUserBizService;
import com.ynmarry.chain.param.output.SysUserDTO;
import com.ynmarry.chain.entity.SysUser;
import com.ynmarry.chain.param.query.SysUserQueryVO;
import com.ynmarry.chain.param.save.SysUserSaveVO;
import com.ynmarry.chain.service.SysUserService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 用户表 业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class SysUserBizServiceImpl extends BaseBizServiceImpl<SysUserSaveVO, SysUserQueryVO, SysUserDTO, SysUser, SysUserService> implements SysUserBizService {
    @Override
    protected void setCriteriaForQuery(SysUserQueryVO vo, QueryWrapper<SysUser> criteria) {
        if(Objects.nonNull(vo.getUserName())){
            criteria.eq("user_name", vo.getUserName());
        }
        if(Objects.nonNull(vo.getPassword())){
            criteria.eq("password", vo.getPassword());
        }
        if(Objects.nonNull(vo.getLastLoginTime())){
            criteria.eq("last_login_time", vo.getLastLoginTime());
        }
        if(Objects.nonNull(vo.getLastLoginIp())){
            criteria.eq("last_login_ip", vo.getLastLoginIp());
        }
        if(Objects.nonNull(vo.getUserType())){
            criteria.eq("user_type", vo.getUserType());
        }
        if(Objects.nonNull(vo.getRelationId())){
            criteria.eq("relation_id", vo.getRelationId());
        }
        if(Objects.nonNull(vo.getValid())){
            criteria.eq("valid", vo.getValid());
        }
        if(Objects.nonNull(vo.getRoleId())){
            criteria.eq("role_id", vo.getRoleId());
        }
        if(Objects.nonNull(vo.getContacts())){
            criteria.eq("contacts", vo.getContacts());
        }
        if(Objects.nonNull(vo.getContactsPhone())){
            criteria.eq("contacts_phone", vo.getContactsPhone());
        }
        if(Objects.nonNull(vo.getCreateUser())){
            criteria.eq("create_user", vo.getCreateUser());
        }
        if(Objects.nonNull(vo.getIntegral())){
            criteria.eq("integral", vo.getIntegral());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}