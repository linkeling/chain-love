package com.match.making.rest.v1;
import com.match.making.rest.CrudController;
import com.match.making.biz.SysRoleBizService;
import com.match.making.param.output.SysRoleDTO;
import com.match.making.param.query.SysRoleQueryVO;
import com.match.making.param.save.SysRoleSaveVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：系统管理-角色表  接口
 * @author lkl
 * @version 2021-09-06
 */
@Api(tags = "sys-role",description = "系统管理-角色表 ")
@RestController
@RequestMapping("/v1/chain-admin/sys-role")
public class SysRoleController extends CrudController<SysRoleBizService, SysRoleSaveVO, SysRoleQueryVO, SysRoleDTO> {

}