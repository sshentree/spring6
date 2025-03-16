package com.sshen.spring6.dimap;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * @Title: TestDiref
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/9 23:51
 * @Version: 1.0.0
 * @Description:
 */
public class TestDiref {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("student", Student.class);
        student.run();
    }
}
