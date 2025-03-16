package com.sshen.spring6.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestDi
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/7 22:55
 * @Version: 1.0.0
 * @Description:
 */
public class TestDi {

    @Test
    public void testSetter() {

        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean-di.xml");

        System.out.println("容器加载完成");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);

    }

    @Test
    public void testConstructor() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");

        Book bookCon = context.getBean("bookCon", Book.class);
        System.out.println(bookCon);
    }

}
