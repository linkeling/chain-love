package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.CustomerLikeRecordBizService;
import com.match.making.param.output.CustomerLikeRecordDTO;
import com.match.making.param.query.CustomerLikeRecordQueryVO;
import com.match.making.param.save.CustomerLikeRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：用户喜欢记录 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "customer-like-record",description = "用户喜欢记录")
@RestController
@RequestMapping("/v1/chain-admin/customer-like-record")
public class CustomerLikeRecordController extends CrudController<CustomerLikeRecordBizService, CustomerLikeRecordSaveVO, CustomerLikeRecordQueryVO, CustomerLikeRecordDTO> {

}