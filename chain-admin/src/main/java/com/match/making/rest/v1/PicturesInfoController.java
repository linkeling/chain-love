package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.PicturesInfoBizService;
import com.match.making.param.output.PicturesInfoDTO;
import com.match.making.param.query.PicturesInfoQueryVO;
import com.match.making.param.save.PicturesInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：附件资源日志 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "pictures-info",description = "附件资源日志")
@RestController
@RequestMapping("/v1/chain-admin/pictures-info")
public class PicturesInfoController extends CrudController<PicturesInfoBizService, PicturesInfoSaveVO, PicturesInfoQueryVO, PicturesInfoDTO> {

}