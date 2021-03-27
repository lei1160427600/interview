package com.example.interview.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xiaolei
 * @Title: CacheTest
 * @ProjectName interview
 * @Description: TODO
 * @date 4/12/202012:48 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        Object value = redisTemplate.opsForValue().get("key1");
        System.out.println("value======== " + value);
    }
}
