package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.BusinessRecordBizService;
import com.ynmarry.chain.param.output.BusinessRecordDTO;
import com.ynmarry.chain.param.query.BusinessRecordQueryVO;
import com.ynmarry.chain.param.save.BusinessRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：交易记录表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "business-record",description = "交易记录表")
@RestController
@RequestMapping("/v1/chain-admin/business-record")
public class BusinessRecordController extends CrudController<BusinessRecordBizService, BusinessRecordSaveVO, BusinessRecordQueryVO, BusinessRecordDTO> {

}