package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.RechargeRecordBizService;
import com.ynmarry.chain.param.output.RechargeRecordDTO;
import com.ynmarry.chain.param.query.RechargeRecordQueryVO;
import com.ynmarry.chain.param.save.RechargeRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：充值记录表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "recharge-record",description = "充值记录表")
@RestController
@RequestMapping("/v1/chain-admin/recharge-record")
public class RechargeRecordController extends CrudController<RechargeRecordBizService, RechargeRecordSaveVO, RechargeRecordQueryVO, RechargeRecordDTO> {

}