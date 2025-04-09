package com.sshen.spring6.advance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Test
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/30 23:09
 * @Version: 1.0.0
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        // 加载配置文件，并进行对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-adv.xml");

        SUser user = context.getBean("user", SUser.class);
        System.out.println(user);

    }
}
