package com.sshen.spring6.proxy;

import org.junit.Test;

/**
 * @Title: ProxyTest
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/15 23:44
 * @Version: 1.0.0
 * @Description:
 */
public class ProxyTest {

    @Test
    public void test1() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) proxyFactory.getProxy();
        int add = calculator.add(7, 9);
    }

    @Test
    public void test2() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Base base = (Base) proxyFactory.getProxy();
        base.print();
    }
}
