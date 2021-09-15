package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.CustomerBaseInfoBizService;
import com.ynmarry.chain.param.output.CustomerBaseInfoDTO;
import com.ynmarry.chain.param.query.CustomerBaseInfoQueryVO;
import com.ynmarry.chain.param.save.CustomerBaseInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：客户基本信息表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "customer-base-info",description = "客户基本信息表")
@RestController
@RequestMapping("/v1/chain-admin/customer-base-info")
public class CustomerBaseInfoController extends CrudController<CustomerBaseInfoBizService, CustomerBaseInfoSaveVO, CustomerBaseInfoQueryVO, CustomerBaseInfoDTO> {

}