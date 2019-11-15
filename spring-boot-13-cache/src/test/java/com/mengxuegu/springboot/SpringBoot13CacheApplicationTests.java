package com.mengxuegu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot13CacheApplicationTests {
@Autowired
    RedisTemplate redisTemplate;
@Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void contextLoads() {
        //操作字符串的
        stringRedisTemplate.opsForValue().set("name","valud1");


    }


}
