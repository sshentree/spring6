package com.sshen.spring6.resourceloaderaware;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Demo
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/20 22:55
 * @Version: 1.0.0
 * @Description:
 */
public class Demo {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        ResourceLoaderAwareDemo resourceLoaderAwareDemo = context.getBean("ResourceLoaderAwareDemo", ResourceLoaderAwareDemo.class);
        System.out.println(resourceLoaderAwareDemo.getResourceLoader() == context);
    }
}
