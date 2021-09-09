package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.PurchaseRecordBizService;
import com.match.making.param.output.PurchaseRecordDTO;
import com.match.making.param.query.PurchaseRecordQueryVO;
import com.match.making.param.save.PurchaseRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：客户购买记录 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "purchase-record",description = "客户购买记录")
@RestController
@RequestMapping("/v1/chain-admin/purchase-record")
public class PurchaseRecordController extends CrudController<PurchaseRecordBizService, PurchaseRecordSaveVO, PurchaseRecordQueryVO, PurchaseRecordDTO> {

}