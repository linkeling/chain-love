package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.DictAreaBizService;
import com.ynmarry.chain.param.output.DictAreaDTO;
import com.ynmarry.chain.param.query.DictAreaQueryVO;
import com.ynmarry.chain.param.save.DictAreaSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：地区字典 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "dict-area",description = "地区字典")
@RestController
@RequestMapping("/v1/chain-admin/dict-area")
public class DictAreaController extends CrudController<DictAreaBizService, DictAreaSaveVO, DictAreaQueryVO, DictAreaDTO> {

}