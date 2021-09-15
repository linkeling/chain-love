package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.MeddiumLeadRecordBizService;
import com.ynmarry.chain.param.output.MeddiumLeadRecordDTO;
import com.ynmarry.chain.param.query.MeddiumLeadRecordQueryVO;
import com.ynmarry.chain.param.save.MeddiumLeadRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：红娘引入记录 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "meddium-lead-record",description = "红娘引入记录")
@RestController
@RequestMapping("/v1/chain-admin/meddium-lead-record")
public class MeddiumLeadRecordController extends CrudController<MeddiumLeadRecordBizService, MeddiumLeadRecordSaveVO, MeddiumLeadRecordQueryVO, MeddiumLeadRecordDTO> {

}