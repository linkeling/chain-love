package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.SysLogsBizService;
import com.ynmarry.chain.param.output.SysLogsDTO;
import com.ynmarry.chain.param.query.SysLogsQueryVO;
import com.ynmarry.chain.param.save.SysLogsSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：系统管理 - 日志表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "sys-logs",description = "系统管理 - 日志表")
@RestController
@RequestMapping("/v1/chain-admin/sys-logs")
public class SysLogsController extends CrudController<SysLogsBizService, SysLogsSaveVO, SysLogsQueryVO, SysLogsDTO> {

}