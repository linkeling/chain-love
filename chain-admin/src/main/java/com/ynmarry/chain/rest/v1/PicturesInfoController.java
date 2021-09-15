package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.PicturesInfoBizService;
import com.ynmarry.chain.param.output.PicturesInfoDTO;
import com.ynmarry.chain.param.query.PicturesInfoQueryVO;
import com.ynmarry.chain.param.save.PicturesInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：附件资源日志 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "pictures-info",description = "附件资源日志")
@RestController
@RequestMapping("/v1/chain-admin/pictures-info")
public class PicturesInfoController extends CrudController<PicturesInfoBizService, PicturesInfoSaveVO, PicturesInfoQueryVO, PicturesInfoDTO> {

}