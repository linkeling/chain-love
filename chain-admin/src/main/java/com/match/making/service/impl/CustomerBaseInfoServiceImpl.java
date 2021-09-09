package com.match.making.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.match.making.dao.CustomerBaseInfoDAO;
import com.match.making.entity.CustomerBaseInfo;
import com.match.making.service.CustomerBaseInfoService;
import org.springframework.stereotype.Service;

/**
 * 客户基本信息表 Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class CustomerBaseInfoServiceImpl extends ServiceImpl<CustomerBaseInfoDAO,CustomerBaseInfo> implements CustomerBaseInfoService {

}