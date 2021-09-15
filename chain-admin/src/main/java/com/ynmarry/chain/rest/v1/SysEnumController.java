package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.SysEnumBizService;
import com.ynmarry.chain.param.output.SysEnumDTO;
import com.ynmarry.chain.param.query.SysEnumQueryVO;
import com.ynmarry.chain.param.save.SysEnumSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：枚举信息 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "sys-enum",description = "枚举信息")
@RestController
@RequestMapping("/v1/chain-admin/sys-enum")
public class SysEnumController extends CrudController<SysEnumBizService, SysEnumSaveVO, SysEnumQueryVO, SysEnumDTO> {

}