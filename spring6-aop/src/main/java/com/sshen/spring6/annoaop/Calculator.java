package com.sshen.spring6.annoaop;

/**
 * @Title: Calculator
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/15 23:11
 * @Version: 1.0.0
 * @Description: 计算器接口
 */
public interface Calculator {

    int add(int a, int b);

    int sub(int a, int b);

    int mul(int a, int b);

    double div(int a, int b);
}
