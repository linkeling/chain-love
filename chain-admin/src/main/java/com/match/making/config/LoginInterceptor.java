package com.match.making.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.match.making.NoToken;
import com.match.making.base.ResponseCode;
import com.match.making.base.ResponseDataModel;
import com.match.making.param.output.SysUserDTO;
import com.match.making.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by lkl19 on 2019/12/18.
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
 	private ObjectMapper objectMapper;

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object object) throws Exception {
        // 如果不是映射到方法直接通过
        if (!(object instanceof HandlerMethod)) {
            return true;
        } else {
            HandlerMethod handlerMethod = (HandlerMethod) object;
            Method method = handlerMethod.getMethod();
            // 检查是否有passToken注释，有则跳过认证
            if (method.isAnnotationPresent(NoToken.class)) {
                NoToken passToken = method.getAnnotation(NoToken.class);
                if (passToken.required()) {
                    return true;
                }
            }
        }
        String token = request.getHeader("Authorization");
        if (null == token) {
            return false;
        }
        //获取token
        SysUserDTO sysUserDTO=JwtHelper.getJwtTokenResult(token);
        if (null == sysUserDTO) {
            ResponseDataModel<?> rdm = new ResponseDataModel<>();
            response.setContentType("application/json;charset=UTF-8");
		    rdm.setMsg("没有访问此功能的权限，请联系管理员。");
		    rdm.setCode(ResponseCode.TOKEN_EXPIRATION.code());
		    response.getWriter().write(objectMapper.writeValueAsString(rdm));
//            return false;
        }
        return true;
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object object, ModelAndView mv)
            throws Exception {

    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行
     * （主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object object, Exception ex)
            throws Exception {

    }

}
