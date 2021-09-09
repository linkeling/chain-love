package com.match.making.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.match.making.dao.BusinessRecordDAO;
import com.match.making.entity.BusinessRecord;
import com.match.making.service.BusinessRecordService;
import org.springframework.stereotype.Service;

/**
 * 交易记录表 Service 实现类
 * 
 * @author lkl
 * @version 2021-09-06
 */
@Service
public class BusinessRecordServiceImpl extends ServiceImpl<BusinessRecordDAO,BusinessRecord> implements BusinessRecordService {

}