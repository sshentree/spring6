package com.sshen.spring6.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestUser
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/22 17:28
 * @Version: 1.0.0
 * @Description:
 */
public class TestUser {

    @Test
    public void testUser() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-anno.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
