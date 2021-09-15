package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.SysUserBizService;
import com.ynmarry.chain.param.output.SysUserDTO;
import com.ynmarry.chain.param.query.SysUserQueryVO;
import com.ynmarry.chain.param.save.SysUserSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：用户表 接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "sys-user",description = "用户表")
@RestController
@RequestMapping("/v1/chain-admin/sys-user")
public class SysUserController extends CrudController<SysUserBizService, SysUserSaveVO, SysUserQueryVO, SysUserDTO> {

}