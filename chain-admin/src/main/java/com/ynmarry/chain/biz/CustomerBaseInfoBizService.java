package com.ynmarry.chain.biz;
import com.ynmarry.chain.base.BaseService;
import com.ynmarry.chain.param.output.CustomerBaseInfoDTO;
import com.ynmarry.chain.param.query.CustomerBaseInfoQueryVO;
import com.ynmarry.chain.param.save.CustomerBaseInfoSaveVO;

/**
 * 客户基本信息表 业务Service
 * 
 * @author lkl
 * @version 2021-09-11
 */
public interface CustomerBaseInfoBizService extends BaseService<CustomerBaseInfoSaveVO, CustomerBaseInfoQueryVO, CustomerBaseInfoDTO> {

}