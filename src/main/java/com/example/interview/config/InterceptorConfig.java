package com.example.interview.config;

import com.example.interview.interceptor.TestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author xiaolei
 * @Title: InterceptorConfig
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/1022:16
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    /**
     *  注入自定义拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/**");//拦截所有请求
    }
}
