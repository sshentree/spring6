package com.sshen.spring6.proxy;

/**
 * @Title: CalculatorImpl
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/15 23:16
 * @Version: 1.0.0
 * @Description: 计算机实现类
 */
public class CalculatorImpl implements Calculator, Base {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public void print() {
        System.out.println("基础接口");
    }
}
