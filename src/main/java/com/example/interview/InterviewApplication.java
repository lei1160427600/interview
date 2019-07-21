package com.example.interview;

import com.alibaba.fastjson.JSONObject;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.example.interview.dao.UserDao;
import com.example.interview.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = "com.example.interview")
@RestController
@EnableApolloConfig
@RequestMapping(value = "/test")
@Slf4j
public class InterviewApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(InterviewApplication.class);
    @Autowired
    private UserDao userDao;
    @ApolloConfig
    private Config config;
    @Autowired
    private User user;
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String sayHello(){
        Set<String> set = config.getPropertyNames();
        System.out.println("Hello word");
        System.out.println(JSONObject.toJSONString(set));
        log.info("logger...................");
        return "Hello word";
    }
//    static {
//        System.setProperty("-Dapp.id","123456");
//        System.setProperty("-Denv","dev");
//        System.setProperty("-Ddev_meta","http://127.0.0.1:8080");
//    }
    @RequestMapping(value = "/getUserById/{id}",method = RequestMethod.GET)
    public UserTest getUser(@PathVariable Long id){
        return userDao.getUserById(id);
    }
    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
    }

}
