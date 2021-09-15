package com.ynmarry.chain.biz;
import com.ynmarry.chain.base.BaseService;
import com.ynmarry.chain.param.output.CustomerLikeRecordDTO;
import com.ynmarry.chain.param.query.CustomerLikeRecordQueryVO;
import com.ynmarry.chain.param.save.CustomerLikeRecordSaveVO;

import java.util.List;

/**
 * 用户喜欢记录 业务Service
 * 
 * @author lkl
 * @version 2021-09-11
 */
public interface CustomerLikeRecordBizService extends BaseService<CustomerLikeRecordSaveVO, CustomerLikeRecordQueryVO, CustomerLikeRecordDTO> {

    /**
     * 查询我喜欢的记录
     * @param userId
     * @return
     */
    List<CustomerLikeRecordDTO> queryByUserId(long userId);
}