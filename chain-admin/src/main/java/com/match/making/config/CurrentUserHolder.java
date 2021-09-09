package com.match.making.config;

import com.match.making.exception.BusinessException;
import com.match.making.param.output.SysUserDTO;
import com.match.making.utils.JwtHelper;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class CurrentUserHolder {


    // 使用

    public static SysUserDTO getCurrentUser() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader("Authorization");
        if (null == token) {
            throw new BusinessException("获取token信息失败，请稍后再试！");
        }
        SysUserDTO sysUserInfoDTO = JwtHelper.getJwtTokenResult(token);
        return sysUserInfoDTO;
    }
}
