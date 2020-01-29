package com.fh.interceptor;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //处理跨域问题
        response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        //处理客户端传过来的自定义头信息
        response.addHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "content-type,abc,x-auth");
        // 处理客户端发过来put,delete
        response.addHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "PUT,POST,DELETE,GET,OPTIONS");


        return true;
    }
}
