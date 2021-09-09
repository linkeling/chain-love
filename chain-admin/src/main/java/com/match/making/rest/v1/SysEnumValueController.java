package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.SysEnumValueBizService;
import com.match.making.param.output.SysEnumValueDTO;
import com.match.making.param.query.SysEnumValueQueryVO;
import com.match.making.param.save.SysEnumValueSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：枚举值 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "sys-enum-value",description = "枚举值")
@RestController
@RequestMapping("/v1/chain-admin/sys-enum-value")
public class SysEnumValueController extends CrudController<SysEnumValueBizService, SysEnumValueSaveVO, SysEnumValueQueryVO, SysEnumValueDTO> {

}