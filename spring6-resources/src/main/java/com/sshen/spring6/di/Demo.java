package com.sshen.spring6.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Demo
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/20 23:17
 * @Version: 1.0.0
 * @Description:
 */
public class Demo {

    @Test
    public void test() {

        /**
         * 将Resource作为属性，使用依赖注入方式
         * 通过<property name="resource" value="classpath:log4j2.xml"/>
         *
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        ResourceDemo resourceDemo = context.getBean("ResourceDemo", ResourceDemo.class);
        resourceDemo.run();
    }
}
