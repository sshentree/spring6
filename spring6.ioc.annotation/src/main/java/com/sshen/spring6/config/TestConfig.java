package com.sshen.spring6.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Title: TestConfig
 * @Author: shendez@163.com
 * @CreateTime: 2025/2/23 19:25
 * @Version: 1.0.0
 * @Description:
 */
public class TestConfig {

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        user.run();
    }
}
