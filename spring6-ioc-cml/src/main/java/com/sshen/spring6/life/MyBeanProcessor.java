package com.sshen.spring6.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Title: MyBeanProcessor
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/18 23:21
 * @Version: 1.0.0
 * @Description:
 */
public class MyBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3：前置处理器(初始化之前)" + beanName + "：" + bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5：后置处理器(初始化之后)" + beanName + "：" + bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
