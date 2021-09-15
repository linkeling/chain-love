package com.ynmarry.chain.rest.v1;
import com.ynmarry.chain.rest.CrudController;
import com.ynmarry.chain.biz.SysRoleBizService;
import com.ynmarry.chain.param.output.SysRoleDTO;
import com.ynmarry.chain.param.query.SysRoleQueryVO;
import com.ynmarry.chain.param.save.SysRoleSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：系统管理-角色表  接口
 * @author lkl
 * @version 2021-09-11
 */
@Api(tags = "sys-role",description = "系统管理-角色表 ")
@RestController
@RequestMapping("/v1/chain-admin/sys-role")
public class SysRoleController extends CrudController<SysRoleBizService, SysRoleSaveVO, SysRoleQueryVO, SysRoleDTO> {

}