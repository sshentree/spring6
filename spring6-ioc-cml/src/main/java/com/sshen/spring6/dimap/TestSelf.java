package com.sshen.spring6.dimap;

import com.sshen.spring6.di.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/15 17:15
 * @Version: 1.0.0
 * @Description:
 */
public class TestSelf {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-self.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}
