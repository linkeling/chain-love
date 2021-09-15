package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.MediumBaseInfoBizService;
import com.ynmarry.chain.param.output.MediumBaseInfoDTO;
import com.ynmarry.chain.param.query.MediumBaseInfoQueryVO;
import com.ynmarry.chain.param.save.MediumBaseInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：红娘基本信息表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "medium-base-info",description = "红娘基本信息表")
@RestController
@RequestMapping("/v1/chain-admin/medium-base-info")
public class MediumBaseInfoController extends CrudController<MediumBaseInfoBizService, MediumBaseInfoSaveVO, MediumBaseInfoQueryVO, MediumBaseInfoDTO> {

}