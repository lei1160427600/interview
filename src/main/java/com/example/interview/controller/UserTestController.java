package com.example.interview.controller;

import com.alibaba.fastjson.JSONObject;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.example.interview.InterviewApplication;
import com.example.interview.annotation.ApiDescription;
import com.example.interview.entity.UserTest;
import com.example.interview.dao.UserDao;
import com.example.interview.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author xiaolei
 * @Title: UserTestController
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/923:31
 */
@RestController
@Slf4j
@RequestMapping("/test")
public class UserTestController {
    @Autowired
    private UserDao userDao;
    @ApolloConfig
    private Config config;
    @Autowired
    private User user;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ApiDescription(value = "api/test/hello")
    public String sayHello() {
        Set<String> set = config.getPropertyNames();
        System.out.println("Hello word");
        System.out.println(JSONObject.toJSONString(set));
        log.info("logger...................");
        return "Hello word";
    }

    @RequestMapping(value = "/getUserById/{id}", method = RequestMethod.GET)
    @ApiDescription(value = "api/test/getUserById")
    public UserTest getUser(@PathVariable Long id) {
        return userDao.getUserById(id);
    }
}
