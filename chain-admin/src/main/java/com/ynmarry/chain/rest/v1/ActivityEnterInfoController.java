package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.ActivityEnterInfoBizService;
import com.ynmarry.chain.param.output.ActivityEnterInfoDTO;
import com.ynmarry.chain.param.query.ActivityEnterInfoQueryVO;
import com.ynmarry.chain.param.save.ActivityEnterInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：活动报名信息表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "activity-enter-info",description = "活动报名信息表")
@RestController
@RequestMapping("/v1/chain-admin/activity-enter-info")
public class ActivityEnterInfoController extends CrudController<ActivityEnterInfoBizService, ActivityEnterInfoSaveVO, ActivityEnterInfoQueryVO, ActivityEnterInfoDTO> {

}