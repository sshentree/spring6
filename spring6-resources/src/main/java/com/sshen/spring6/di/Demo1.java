package com.sshen.spring6.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Demo1
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/20 23:28
 * @Version: 1.0.0
 * @Description:
 */
public class Demo1 {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-1.xml");

        ResourceDemo1 resourceDemo1 = context.getBean("ResourceDemo1", ResourceDemo1.class);
        resourceDemo1.run();
    }
}
