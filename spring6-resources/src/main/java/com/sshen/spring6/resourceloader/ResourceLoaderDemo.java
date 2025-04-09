package com.sshen.spring6.resourceloader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @Title: Demo
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/20 22:16
 * @Version: 1.0.0
 * @Description:
 */
public class ResourceLoaderDemo {

    @Test
    public void test1() {
        // 获取的是ClassPathResource的Resource实例
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Resource resource = context.getResource("spring.txt");
        System.out.println(resource.getFilename());
    }

    @Test
    public void test2() {
        // 获取的是FileSystemResource的Resource实例
        ApplicationContext context = new FileSystemXmlApplicationContext();
        Resource resource = context.getResource("README.md");
        System.out.println(resource.getFilename());
    }


}
