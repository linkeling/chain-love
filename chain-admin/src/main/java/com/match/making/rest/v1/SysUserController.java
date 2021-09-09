package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.SysUserBizService;
import com.match.making.param.output.SysUserDTO;
import com.match.making.param.query.SysUserQueryVO;
import com.match.making.param.save.SysUserSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：用户表 接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "sys-user",description = "用户表")
@RestController
@RequestMapping("/v1/chain-admin/sys-user")
public class SysUserController extends CrudController<SysUserBizService, SysUserSaveVO, SysUserQueryVO, SysUserDTO> {

}