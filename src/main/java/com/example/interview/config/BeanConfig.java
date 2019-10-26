package com.example.interview.config;

import com.example.interview.filter.FilterTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaolei
 * @Title: BeanConfig
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/923:23
 */
@Configuration
public class BeanConfig {
    @Bean
    public FilterRegistrationBean heFilterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new FilterTest());
        registration.addUrlPatterns("/hs");
        return registration;
    }
}
