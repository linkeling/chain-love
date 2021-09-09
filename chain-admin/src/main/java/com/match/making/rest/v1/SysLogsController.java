package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.SysLogsBizService;
import com.match.making.param.output.SysLogsDTO;
import com.match.making.param.query.SysLogsQueryVO;
import com.match.making.param.save.SysLogsSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：系统管理 - 日志表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "sys-logs",description = "系统管理 - 日志表")
@RestController
@RequestMapping("/v1/chain-admin/sys-logs")
public class SysLogsController extends CrudController<SysLogsBizService, SysLogsSaveVO, SysLogsQueryVO, SysLogsDTO> {

}