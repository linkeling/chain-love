package com.ynmarry.chain.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ynmarry.chain.dao.CustomerLikeRecordDAO;
import com.ynmarry.chain.entity.CustomerLikeRecord;
import com.ynmarry.chain.service.CustomerLikeRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户喜欢记录 Service 实现类
 * 
 * @author lkl
 * @version 2021-09-11
 */
@Service
public class CustomerLikeRecordServiceImpl extends ServiceImpl<CustomerLikeRecordDAO,CustomerLikeRecord> implements CustomerLikeRecordService {

    @Override
    public List<CustomerLikeRecord> getByUserId(long userId) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("user_id",userId);
        return super.list(queryWrapper);
    }
}