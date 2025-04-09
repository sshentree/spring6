package com.sshen.spring6.methodvalidation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @Title: Test
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/8 22:44
 * @Version: 1.0.0
 * @Description:
 */
public class TestMethod {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService myService = context.getBean(MyService.class);
        User user = new User();
        user.setRemark("hello word"); // 验证自定义校验注解
        try {
            myService.validate(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


//        myService.validate("");
    }
}
