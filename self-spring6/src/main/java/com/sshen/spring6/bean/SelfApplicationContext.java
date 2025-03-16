package com.sshen.spring6.bean;

/**
 * @Title: SelfApplicationContext
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/5 17:09
 * @Version: 1.0.0
 * @Description:
 */
public interface SelfApplicationContext {

    // 获取组件
    <T> Object getBean(Class<T> tClass);
}
