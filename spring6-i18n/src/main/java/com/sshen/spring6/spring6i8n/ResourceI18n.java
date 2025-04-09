package com.sshen.spring6.spring6i8n;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @Title: ResourceI18n
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/31 20:55
 * @Version: 1.0.0
 * @Description:
 */
public class ResourceI18n {

    /**
     * spring6的国际化
     * context容器：实现了ResourceLoader接口，即可获取Resource实例
     *
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] param = {"张三", new Date()};
        String message = context.getMessage("hello", param, Locale.CHINA);
        System.out.println(message);
    }
}
