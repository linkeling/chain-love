package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.CustomerIntegralBizService;
import com.match.making.param.output.CustomerIntegralDTO;
import com.match.making.param.query.CustomerIntegralQueryVO;
import com.match.making.param.save.CustomerIntegralSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：等级积分关系表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "customer-integral",description = "等级积分关系表")
@RestController
@RequestMapping("/v1/chain-admin/customer-integral")
public class CustomerIntegralController extends CrudController<CustomerIntegralBizService, CustomerIntegralSaveVO, CustomerIntegralQueryVO, CustomerIntegralDTO> {

}