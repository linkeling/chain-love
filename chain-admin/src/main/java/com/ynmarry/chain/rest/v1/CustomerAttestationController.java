package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.CustomerAttestationBizService;
import com.ynmarry.chain.param.output.CustomerAttestationDTO;
import com.ynmarry.chain.param.query.CustomerAttestationQueryVO;
import com.ynmarry.chain.param.save.CustomerAttestationSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：相亲资料认证表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "customer-attestation",description = "相亲资料认证表")
@RestController
@RequestMapping("/v1/chain-admin/customer-attestation")
public class CustomerAttestationController extends CrudController<CustomerAttestationBizService, CustomerAttestationSaveVO, CustomerAttestationQueryVO, CustomerAttestationDTO> {

}