package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.ActivityBaseInfoBizService;
import com.match.making.param.output.ActivityBaseInfoDTO;
import com.match.making.param.query.ActivityBaseInfoQueryVO;
import com.match.making.param.save.ActivityBaseInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：活动基本信息表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "activity-base-info",description = "活动基本信息表")
@RestController
@RequestMapping("/v1/chain-admin/activity-base-info")
public class ActivityBaseInfoController extends CrudController<ActivityBaseInfoBizService, ActivityBaseInfoSaveVO, ActivityBaseInfoQueryVO, ActivityBaseInfoDTO> {

}