package com.ynmarry.chain.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ynmarry.chain.dao.BusinessRecordDAO;
import com.ynmarry.chain.entity.BusinessRecord;
import com.ynmarry.chain.service.BusinessRecordService;
import org.springframework.stereotype.Service;

/**
 * 交易记录表 Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class BusinessRecordServiceImpl extends ServiceImpl<BusinessRecordDAO,BusinessRecord> implements BusinessRecordService {

}