package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.SysEnumBizService;
import com.match.making.param.output.SysEnumDTO;
import com.match.making.param.query.SysEnumQueryVO;
import com.match.making.param.save.SysEnumSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：枚举信息 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "sys-enum",description = "枚举信息")
@RestController
@RequestMapping("/v1/chain-admin/sys-enum")
public class SysEnumController extends CrudController<SysEnumBizService, SysEnumSaveVO, SysEnumQueryVO, SysEnumDTO> {

}