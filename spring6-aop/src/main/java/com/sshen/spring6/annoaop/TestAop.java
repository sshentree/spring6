package com.sshen.spring6.annoaop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestAop
 * @Author: shendez@163.com
 * @CreateTime: 2025/2/25 23:24
 * @Version: 1.0.0
 * @Description:
 */
public class TestAop {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 容器中获取的对象已经不是CalculatorImpl.class，而是代理类
        Calculator calculator = context.getBean("calculatorImpl", Calculator.class);
//        int result = calculator.add(4, 5);
        double result = calculator.div(6, 1);
        System.out.println("结果：" + result);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 容器中获取的对象已经不是CalculatorImpl.class，而是代理类
        Base base = context.getBean("calculatorImpl", Base.class);
        base.print();
    }
}
