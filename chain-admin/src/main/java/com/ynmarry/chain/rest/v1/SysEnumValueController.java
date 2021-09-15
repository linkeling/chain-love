package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.SysEnumValueBizService;
import com.ynmarry.chain.param.output.SysEnumValueDTO;
import com.ynmarry.chain.param.query.SysEnumValueQueryVO;
import com.ynmarry.chain.param.save.SysEnumValueSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：枚举值 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "sys-enum-value",description = "枚举值")
@RestController
@RequestMapping("/v1/chain-admin/sys-enum-value")
public class SysEnumValueController extends CrudController<SysEnumValueBizService, SysEnumValueSaveVO, SysEnumValueQueryVO, SysEnumValueDTO> {

}