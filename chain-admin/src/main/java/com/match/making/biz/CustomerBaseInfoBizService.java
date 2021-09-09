package com.match.making.biz;
import com.match.making.base.BaseService;
import com.match.making.param.output.CustomerBaseInfoDTO;
import com.match.making.param.query.CustomerBaseInfoQueryVO;
import com.match.making.param.save.CustomerBaseInfoSaveVO;

/**
 * 客户基本信息表 业务Service
 * 
 * @author lkl
 * @version 2021-09-06
 */
public interface CustomerBaseInfoBizService extends BaseService<CustomerBaseInfoSaveVO, CustomerBaseInfoQueryVO, CustomerBaseInfoDTO> {

}