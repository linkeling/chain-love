package com.ynmarry.chain.rest.v1;

import com.ynmarry.chain.base.Pagination;
import com.ynmarry.chain.base.ResponseDataModel;
import com.ynmarry.chain.biz.*;
import com.ynmarry.chain.param.output.*;
import com.ynmarry.chain.param.query.*;
import com.ynmarry.chain.param.save.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "h5-app-info",description = "地区字典")
@RestController
@RequestMapping("/v1/chain-admin/h5")
public class H5AppInfoController {
    @Autowired
    private CustomerBaseInfoBizService customerBaseInfoBizService;
    @Autowired
    private MeddiumLeadRecordBizService meddiumLeadRecordBizService;
    @Autowired
    private ActivityBaseInfoBizService activityBaseInfoBizService;
    @Autowired
    private ActivityEnterInfoBizService activityEnterInfoBizService;
    @Autowired
    private RechargeRecordBizService rechargeRecordBizService;
    @Autowired
    private PurchaseRecordBizService purchaseRecordBizService;
    @Autowired
    private CustomerLikeRecordBizService customerLikeRecordBizService;

    @ApiOperation(value = "1.01 首页推荐", httpMethod = "GET", notes = "1.01 首页推荐")
    @GetMapping("/customer-base-info/page")
    public ResponseDataModel<Pagination<CustomerBaseInfoDTO>> queryCustomerPagination(@Validated CustomerBaseInfoQueryVO vo) {
        return ResponseDataModel.ok(customerBaseInfoBizService.queryPagination(vo));
    }

    @ApiOperation(value = "1.02 根据id查询个人信息", httpMethod = "GET", notes = "1.02 根据id查询个人信息")
    @ApiImplicitParam(dataType = "string", name = "id", value = "主键", example = "1", type = "path")
    @GetMapping("/customer-base-info/{id}")
    public ResponseDataModel<CustomerBaseInfoDTO> queryCustomerById(@PathVariable long id) {
        return ResponseDataModel.ok(customerBaseInfoBizService.queryById(id));
    }

    @ApiOperation(value = "1.03 新增客户信息", httpMethod = "POST", notes = "1.03 新增客户信息", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(dataType = "string", name = "id", value = "主键", example = "1", type = "path")
    @PostMapping("/customer-base-info/insert")
    public ResponseDataModel insertCustomerBaseInfo(@Validated @RequestBody CustomerBaseInfoSaveVO vo) {
        return ResponseDataModel.ok(customerBaseInfoBizService.insert(vo));
    }

    @ApiOperation(value = "1.04 修改个人信息", httpMethod = "PUT", notes = "1.04 修改个人信息", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(dataType = "string", name = "id", value = "主键", example = "1", type = "path")
    @PutMapping("/customer-base-info/update")
    public ResponseDataModel updateCustomerBaseInfo(@PathVariable long id,@Validated @RequestBody CustomerBaseInfoSaveVO vo) {
        vo.setId(id);
        return ResponseDataModel.ok(customerBaseInfoBizService.updateSelective(vo));
    }

    @ApiOperation(value = "2.01 红娘列表", httpMethod = "GET", notes = "2.01 红娘列表")
    @GetMapping("/meddium-lead-record/page")
    public ResponseDataModel<Pagination<MeddiumLeadRecordDTO>> queryMeddiumLeadRecordPagination(@Validated MeddiumLeadRecordQueryVO vo) {
        return ResponseDataModel.ok(meddiumLeadRecordBizService.queryPagination(vo));
    }

    @ApiOperation(value = "2.02 红娘申请", httpMethod = "POST", notes = "2.02 红娘申请", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/meddium-lead-record/insert")
    public ResponseDataModel insertCustomerBaseInfo(@Validated @RequestBody MeddiumLeadRecordSaveVO vo) {
        return ResponseDataModel.ok(meddiumLeadRecordBizService.insert(vo));
    }

    @ApiOperation(value = "3.01 活动信息分页查询", httpMethod = "GET", notes = "3.01 活动信息分页查询")
    @GetMapping("/activity-base-info/page")
    public ResponseDataModel<Pagination<ActivityBaseInfoDTO>> queryCustomerPagination(@Validated ActivityBaseInfoQueryVO vo) {
        return ResponseDataModel.ok(activityBaseInfoBizService.queryPagination(vo));
    }

    @ApiOperation(value = "3.02 活动报名-新增", httpMethod = "POST", notes = "3.02 活动报名-新增", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/activity-enter-info/insert")
    public ResponseDataModel insertRechargeRecord(@Validated @RequestBody ActivityEnterInfoSaveVO vo) {
        return ResponseDataModel.ok(activityEnterInfoBizService.insert(vo));
    }

    @ApiOperation(value = "4.01 分页查询充值", httpMethod = "GET", notes = "4.01 分页查询充值")
    @GetMapping("/recharge-record/page")
    public ResponseDataModel<Pagination<RechargeRecordDTO>> queryCustomerPagination(@Validated RechargeRecordQueryVO vo) {
        return ResponseDataModel.ok(rechargeRecordBizService.queryPagination(vo));
    }

    @ApiOperation(value = "3.02 充值记录-新增", httpMethod = "POST", notes = "3.02 充值记录-新增", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/recharge-record/insert")
    public ResponseDataModel insertRechargeRecord(@Validated @RequestBody RechargeRecordSaveVO vo) {
        return ResponseDataModel.ok(rechargeRecordBizService.insert(vo));
    }

    @ApiOperation(value = "3.02 购买微信记录-新增", httpMethod = "POST", notes = "3.02 购买微信记录-新增", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/purchase-record/insert")
    public ResponseDataModel insertRechargeRecord(@Validated @RequestBody PurchaseRecordSaveVO vo) {
        return ResponseDataModel.ok(purchaseRecordBizService.insert(vo));
    }

    @ApiOperation(value = "4.01 分页查询购买记录", httpMethod = "GET", notes = "4.01 分页查询购买记录")
    @GetMapping("/purchase-record/page")
    public ResponseDataModel<Pagination<PurchaseRecordDTO>> queryPurchaseRecordPagination(@Validated PurchaseRecordQueryVO vo) {
        return ResponseDataModel.ok(purchaseRecordBizService.queryPagination(vo));
    }

    @ApiOperation(value = "4.01 查询我喜欢的记录", httpMethod = "GET", notes = "4.01 查询我喜欢的记录")
    @GetMapping("/customer-like-record/{userId}")
    public ResponseDataModel<List<CustomerLikeRecordDTO>> queryCustomerPagination(@PathVariable long userId) {
        return ResponseDataModel.ok(customerLikeRecordBizService.queryByUserId(userId));
    }

    @ApiOperation(value = "3.02 新增喜欢-新增", httpMethod = "POST", notes = "3.02 新增喜欢-新增", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/customer-like-record/insert")
    public ResponseDataModel insertLikeRecord(@Validated @RequestBody CustomerLikeRecordSaveVO vo) {
        return ResponseDataModel.ok(customerLikeRecordBizService.insert(vo));
    }

    @ApiOperation(value = "3.02 取消喜欢", httpMethod = "DELETE", notes = "3.02 取消喜欢")
    @ApiImplicitParam(dataType = "string", name = "id", value = "主键", example = "1", type = "path")
    @DeleteMapping("/customer-like-record/delete/{id}")
    public ResponseDataModel deleteLikeRecord(@PathVariable long id) {
        customerLikeRecordBizService.deleteById(id);
        return ResponseDataModel.ok();
    }
}
