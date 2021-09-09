package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.RechargeRecordBizService;
import com.match.making.param.output.RechargeRecordDTO;
import com.match.making.param.query.RechargeRecordQueryVO;
import com.match.making.param.save.RechargeRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：充值记录表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "recharge-record",description = "充值记录表")
@RestController
@RequestMapping("/v1/chain-admin/recharge-record")
public class RechargeRecordController extends CrudController<RechargeRecordBizService, RechargeRecordSaveVO, RechargeRecordQueryVO, RechargeRecordDTO> {

}