package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.CustomerBaseInfoBizService;
import com.match.making.param.output.CustomerBaseInfoDTO;
import com.match.making.param.query.CustomerBaseInfoQueryVO;
import com.match.making.param.save.CustomerBaseInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：客户基本信息表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "customer-base-info",description = "客户基本信息表")
@RestController
@RequestMapping("/v1/chain-admin/customer-base-info")
public class CustomerBaseInfoController extends CrudController<CustomerBaseInfoBizService, CustomerBaseInfoSaveVO, CustomerBaseInfoQueryVO, CustomerBaseInfoDTO> {

}