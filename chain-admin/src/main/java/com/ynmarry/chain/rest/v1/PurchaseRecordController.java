package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.PurchaseRecordBizService;
import com.ynmarry.chain.param.output.PurchaseRecordDTO;
import com.ynmarry.chain.param.query.PurchaseRecordQueryVO;
import com.ynmarry.chain.param.save.PurchaseRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：客户购买记录 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "purchase-record",description = "客户购买记录")
@RestController
@RequestMapping("/v1/chain-admin/purchase-record")
public class PurchaseRecordController extends CrudController<PurchaseRecordBizService, PurchaseRecordSaveVO, PurchaseRecordQueryVO, PurchaseRecordDTO> {

}