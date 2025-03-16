package com.sshen.spring6.annoaop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestAopXml
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/1 17:24
 * @Version: 1.0.0
 * @Description:
 */
public class TestAopXml {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-xml.xml");
        // 容器中获取的对象已经不是CalculatorImpl.class，而是代理类
        Calculator calculator = context.getBean("calculatorImpl", Calculator.class);
        double result = calculator.div(6, 1);
        System.out.println("结果：" + result);
    }
}
