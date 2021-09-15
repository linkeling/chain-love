package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.CustomerLikeRecordBizService;
import com.ynmarry.chain.param.output.CustomerLikeRecordDTO;
import com.ynmarry.chain.param.query.CustomerLikeRecordQueryVO;
import com.ynmarry.chain.param.save.CustomerLikeRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：用户喜欢记录 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "customer-like-record",description = "用户喜欢记录")
@RestController
@RequestMapping("/v1/chain-admin/customer-like-record")
public class CustomerLikeRecordController extends CrudController<CustomerLikeRecordBizService, CustomerLikeRecordSaveVO, CustomerLikeRecordQueryVO, CustomerLikeRecordDTO> {

}