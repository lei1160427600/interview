package com.example.interview;

import com.alibaba.fastjson.JSONObject;
import com.example.interview.dao.UserDao;
import com.example.interview.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = "com.example.interview")
@RestController
@RequestMapping(value = "/test")
public class InterviewApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(InterviewApplication.class);
    @Autowired
    private UserDao userDao;
    @Autowired
    private User user;
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String sayHello(){
        System.out.println("Hello word");
        System.out.println(JSONObject.toJSONString(user));
        LOGGER.info("logger...................");
        return "Hello word";
    }
    @RequestMapping(value = "/getUserById/{id}",method = RequestMethod.GET)
    public UserTest getUser(@PathVariable Long id){
        return userDao.getUserById(id);
    }
    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
    }

}
