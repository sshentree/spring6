package com.sshen.spring6.junit5;

import com.sshen.spring6.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Title: TestJunit5InnerAnno
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/2 12:20
 * @Version: 1.0.0
 * @Description:
 */
@SpringJUnitConfig(classes = {TestJunit5InnerAnno.Config.class})
public class TestJunit5InnerAnno {

    @Configuration
    @ComponentScan(value = {"com.sshen.spring6"})
    static class Config {

    }

    @Resource
    private User user;


    @Test
    public void test5() {
        System.out.println(user);
        user.run();
    }
}
