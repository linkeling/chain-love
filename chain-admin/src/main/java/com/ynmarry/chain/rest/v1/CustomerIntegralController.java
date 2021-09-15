package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.CustomerIntegralBizService;
import com.ynmarry.chain.param.output.CustomerIntegralDTO;
import com.ynmarry.chain.param.query.CustomerIntegralQueryVO;
import com.ynmarry.chain.param.save.CustomerIntegralSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：等级积分关系表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "customer-integral",description = "等级积分关系表")
@RestController
@RequestMapping("/v1/chain-admin/customer-integral")
public class CustomerIntegralController extends CrudController<CustomerIntegralBizService, CustomerIntegralSaveVO, CustomerIntegralQueryVO, CustomerIntegralDTO> {

}