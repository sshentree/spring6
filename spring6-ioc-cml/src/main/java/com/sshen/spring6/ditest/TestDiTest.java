package com.sshen.spring6.ditest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestDiTest
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/8 0:35
 * @Version: 1.0.0
 * @Description:
 */
public class TestDiTest {

    @Test
    public void testOutBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        emp.work();
    }

    @Test
    public void testInnerBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = context.getBean("emp2", Emp.class);
        emp.work();
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        emp.work();
        // dept部门也会改变
        Dept dept = context.getBean("dept", Dept.class);
        System.out.println(dept.getName());

    }

    @Test
    public void testList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-list.xml");
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();

    }
}
