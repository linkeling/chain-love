package com.ynmarry.chain.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ynmarry.chain.dao.CustomerBaseInfoDAO;
import com.ynmarry.chain.entity.CustomerBaseInfo;
import com.ynmarry.chain.service.CustomerBaseInfoService;
import org.springframework.stereotype.Service;

/**
 * 客户基本信息表 Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class CustomerBaseInfoServiceImpl extends ServiceImpl<CustomerBaseInfoDAO,CustomerBaseInfo> implements CustomerBaseInfoService {

}