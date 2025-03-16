package com.sshen.spring6.life;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: LifeTest
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/18 23:29
 * @Version: 1.0.0
 * @Description:
 */
public class LifeTest {

    @Test
    public void testLife() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");

        User user = context.getBean("user", User.class);
        user.run();
        // IOC容器管理，即单例bean销毁
        context.close();
        System.out.println("8：容器管理");
    }
}
