package com.galoiszhou.springclould.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDaoTest {

    @Test
    public void contextLoads() {

    }

    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis() {
        this.redisDao.setKey("name", "galois");
        this.redisDao.setKey("age", "18");
        System.out.println(this.redisDao.getValue("name"));
        System.out.println(this.redisDao.getValue("age"));
    }
}
