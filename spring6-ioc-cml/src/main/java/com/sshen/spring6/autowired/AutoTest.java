package com.sshen.spring6.autowired;

import com.sshen.spring6.autowired.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: AutoTest
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/22 15:16
 * @Version: 1.0.0
 * @Description:
 */
public class AutoTest {

    @Test
    public void testAuto() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-auto.xml");

        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();

    }
}
