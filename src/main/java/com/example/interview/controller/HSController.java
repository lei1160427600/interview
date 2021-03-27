package com.example.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaolei
 * @Title: HSController
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/923:29
 */
@RestController
@RequestMapping("/")
public class HSController {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate; //默认提供的用来操作字符串的redis操作实例

    @Autowired
    @RequestMapping("hs")
    public String hs() {
        return "OK";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        ValueOperations<String, String> opt = redisTemplate.opsForValue();
//        opt.set("key1", "oooooooo");
        stringRedisTemplate.opsForValue().set("key1","test------------------");
        String value = stringRedisTemplate.opsForValue().get("key1");
        String value2 = stringRedisTemplate.opsForValue().get("key2");
        System.out.println("value===== " + value + "---"+value2);
        return value;
    }
}
