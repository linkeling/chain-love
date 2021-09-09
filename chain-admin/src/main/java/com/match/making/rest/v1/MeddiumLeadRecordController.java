package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.MeddiumLeadRecordBizService;
import com.match.making.param.output.MeddiumLeadRecordDTO;
import com.match.making.param.query.MeddiumLeadRecordQueryVO;
import com.match.making.param.save.MeddiumLeadRecordSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：红娘引入记录 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "meddium-lead-record",description = "红娘引入记录")
@RestController
@RequestMapping("/v1/chain-admin/meddium-lead-record")
public class MeddiumLeadRecordController extends CrudController<MeddiumLeadRecordBizService, MeddiumLeadRecordSaveVO, MeddiumLeadRecordQueryVO, MeddiumLeadRecordDTO> {

}