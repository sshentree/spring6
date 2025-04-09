package com.sshen.spring6.methodvalidation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @Title: ValidationConfig
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/8 22:37
 * @Version: 1.0.0
 * @Description:
 */
@Configuration
@ComponentScan(value = {"com.sshen.spring6.methodvalidation"})
public class ValidationConfig {

    @Bean
    public MethodValidationPostProcessor validationPostProcessor() {
        MethodValidationPostProcessor methodValidationPostProcessor = new MethodValidationPostProcessor();
        return methodValidationPostProcessor;
    }
}
