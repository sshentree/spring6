package com.sshen.spring6.config;

import org.springframework.stereotype.Component;

/**
 * @Title: User
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/22 17:27
 * @Version: 1.0.0
 * @Description:
 */
@Component(value = "user")
public class User {

    public void run() {
        System.out.println("执行！！！");
    }
}
