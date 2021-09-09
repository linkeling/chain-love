package com.match.making.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.match.making.dao.SysUserDAO;
import com.match.making.entity.SysUser;
import com.match.making.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 用户表 Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDAO,SysUser> implements SysUserService {

}