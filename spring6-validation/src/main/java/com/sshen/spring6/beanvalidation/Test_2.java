package com.sshen.spring6.beanvalidation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @Title: Test_2
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/6 22:56
 * @Version: 1.0.0
 * @Description:
 */
public class Test_2 {

    @Test
    public void test() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);

        User user = new User();
//        user.setName("tom");
//        user.setAge(100);
        BindException bindException = new BindException(user, user.getClass().getName());

        Validator validator = context.getBean(Validator.class);
        validator.validate(user, bindException);
        if (bindException.hasErrors()) {
            System.out.println(bindException.getAllErrors());
        }
    }
}
