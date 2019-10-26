package com.example.interview.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaolei
 * @Title: MainService
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/8/1023:00
 */
@Configuration
public class MainService implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("test===========================");
    }
}
