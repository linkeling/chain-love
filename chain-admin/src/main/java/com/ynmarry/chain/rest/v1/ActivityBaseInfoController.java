package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.ActivityBaseInfoBizService;
import com.ynmarry.chain.param.output.ActivityBaseInfoDTO;
import com.ynmarry.chain.param.query.ActivityBaseInfoQueryVO;
import com.ynmarry.chain.param.save.ActivityBaseInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：活动基本信息表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "activity-base-info",description = "活动基本信息表")
@RestController
@RequestMapping("/v1/chain-admin/activity-base-info")
public class ActivityBaseInfoController extends CrudController<ActivityBaseInfoBizService, ActivityBaseInfoSaveVO, ActivityBaseInfoQueryVO, ActivityBaseInfoDTO> {

}