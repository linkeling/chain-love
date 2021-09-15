package com.ynmarry.chain.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ynmarry.chain.entity.CustomerLikeRecord;
import com.ynmarry.chain.param.output.CustomerLikeRecordDTO;

import java.util.List;

/**
 * 用户喜欢记录 Service
 * 
 * @author lkl
 * @version 2021-09-11
 */
public interface CustomerLikeRecordService extends IService<CustomerLikeRecord> {

    /**
     * 查询我喜欢的记录
     * @param userId
     * @return
     */
    List<CustomerLikeRecord> getByUserId(long userId);
}