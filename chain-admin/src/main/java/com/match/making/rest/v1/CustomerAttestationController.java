package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.CustomerAttestationBizService;
import com.match.making.param.output.CustomerAttestationDTO;
import com.match.making.param.query.CustomerAttestationQueryVO;
import com.match.making.param.save.CustomerAttestationSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：相亲资料认证表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "customer-attestation",description = "相亲资料认证表")
@RestController
@RequestMapping("/v1/chain-admin/customer-attestation")
public class CustomerAttestationController extends CrudController<CustomerAttestationBizService, CustomerAttestationSaveVO, CustomerAttestationQueryVO, CustomerAttestationDTO> {

}