package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.DictAreaBizService;
import com.match.making.param.output.DictAreaDTO;
import com.match.making.param.query.DictAreaQueryVO;
import com.match.making.param.save.DictAreaSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：地区字典 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "dict-area",description = "地区字典")
@RestController
@RequestMapping("/v1/chain-admin/dict-area")
public class DictAreaController extends CrudController<DictAreaBizService, DictAreaSaveVO, DictAreaQueryVO, DictAreaDTO> {

}