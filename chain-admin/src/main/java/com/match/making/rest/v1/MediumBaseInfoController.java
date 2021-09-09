package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.MediumBaseInfoBizService;
import com.match.making.param.output.MediumBaseInfoDTO;
import com.match.making.param.query.MediumBaseInfoQueryVO;
import com.match.making.param.save.MediumBaseInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：红娘基本信息表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "medium-base-info",description = "红娘基本信息表")
@RestController
@RequestMapping("/v1/chain-admin/medium-base-info")
public class MediumBaseInfoController extends CrudController<MediumBaseInfoBizService, MediumBaseInfoSaveVO, MediumBaseInfoQueryVO, MediumBaseInfoDTO> {

}