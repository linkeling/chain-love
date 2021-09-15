package com.ynmarry.chain.biz;
import com.ynmarry.chain.base.BaseService;
import com.ynmarry.chain.param.output.BusinessRecordDTO;
import com.ynmarry.chain.param.query.BusinessRecordQueryVO;
import com.ynmarry.chain.param.save.BusinessRecordSaveVO;

/**
 * 交易记录表 业务Service
 * 
 * @author lkl
 * @version 2021-09-11
 */
public interface BusinessRecordBizService extends BaseService<BusinessRecordSaveVO, BusinessRecordQueryVO, BusinessRecordDTO> {

}