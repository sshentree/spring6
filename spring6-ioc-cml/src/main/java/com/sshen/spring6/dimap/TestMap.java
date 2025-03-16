package com.sshen.spring6.dimap;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestMap
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/8 22:33
 * @Version: 1.0.0
 * @Description:
 */
public class TestMap {

    @Test
    public void testMap() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-map.xml");
        Student student = context.getBean("student", Student.class);
        student.run();

    }
}
