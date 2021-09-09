package com.match.making.biz.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.match.making.BaseBizServiceImpl;
import com.match.making.biz.SysRoleBizService;
import com.match.making.param.output.SysRoleDTO;
import com.match.making.entity.SysRole;
import com.match.making.param.query.SysRoleQueryVO;
import com.match.making.param.save.SysRoleSaveVO;
import com.match.making.service.SysRoleService;
import org.springframework.stereotype.Service;
import java.util.Objects;

/**
 * 系统管理-角色表  业务Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class SysRoleBizServiceImpl extends BaseBizServiceImpl<SysRoleSaveVO, SysRoleQueryVO, SysRoleDTO, SysRole, SysRoleService> implements SysRoleBizService {
    @Override
    protected void setCriteriaForQuery(SysRoleQueryVO vo, QueryWrapper<SysRole> criteria) {
        if(Objects.nonNull(vo.getRoleCode())){
            criteria.eq("role_code", vo.getRoleCode());
        }
        if(Objects.nonNull(vo.getRoleName())){
            criteria.eq("role_name", vo.getRoleName());
        }
        if(Objects.nonNull(vo.getRemarks())){
            criteria.eq("remarks", vo.getRemarks());
        }
        if(Objects.nonNull(vo.getCreated())){
            criteria.eq("created", vo.getCreated());
        }
        if(Objects.nonNull(vo.getUpdated())){
            criteria.eq("updated", vo.getUpdated());
        }
    }
}