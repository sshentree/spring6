package com.sshen.spring6.simple;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @Title: TestUser
 * @Author: shendez@163.com
 * @CreateTime: 2024/11/26 23:23
 * @Version: 1.0.0
 * @Description:
 */
public class TestUser {

    private static final Logger log = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 加载配置文件，并进行对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        // 对象调用方法
        user.add();

        // 获取类的class对象
        Class<?> aClass = Class.forName("com.sshen.spring6.simple.User");
        // 方法已过时
//        User user1 = (User) aClass.newInstance();
        // 获取公共的无参构造器，创建对象
        User user2 = (User) aClass.getConstructor().newInstance();
        // 获取公共的有参构造器，创建对象
//        User user3 = (User) aClass.getConstructor(String.class).newInstance("name");
        System.out.println(user2);
        user2.add();
    }

}
