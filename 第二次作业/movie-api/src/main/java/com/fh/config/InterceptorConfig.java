package com.fh.config;

import com.fh.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

//拦截器配置类
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    private LoginInterceptor loginInterceptor;



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**");

    }


}
