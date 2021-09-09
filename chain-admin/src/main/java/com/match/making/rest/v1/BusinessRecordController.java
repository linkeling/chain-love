package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.BusinessRecordBizService;
import com.match.making.param.output.BusinessRecordDTO;
import com.match.making.param.query.BusinessRecordQueryVO;
import com.match.making.param.save.BusinessRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：交易记录表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "business-record",description = "交易记录表")
@RestController
@RequestMapping("/v1/chain-admin/business-record")
public class BusinessRecordController extends CrudController<BusinessRecordBizService, BusinessRecordSaveVO, BusinessRecordQueryVO, BusinessRecordDTO> {

}