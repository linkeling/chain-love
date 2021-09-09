package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.ActivityEnterInfoBizService;
import com.match.making.param.output.ActivityEnterInfoDTO;
import com.match.making.param.query.ActivityEnterInfoQueryVO;
import com.match.making.param.save.ActivityEnterInfoSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：活动报名信息表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "activity-enter-info",description = "活动报名信息表")
@RestController
@RequestMapping("/v1/chain-admin/activity-enter-info")
public class ActivityEnterInfoController extends CrudController<ActivityEnterInfoBizService, ActivityEnterInfoSaveVO, ActivityEnterInfoQueryVO, ActivityEnterInfoDTO> {

}