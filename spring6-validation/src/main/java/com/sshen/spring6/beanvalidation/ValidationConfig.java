package com.sshen.spring6.beanvalidation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @Title: ValidationConfig
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/6 18:17
 * @Version: 1.0.0
 * @Description:
 */
@Configuration
@ComponentScan(value = {"com.sshen.spring6.beanvalidation"})
public class ValidationConfig {

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
        return factoryBean;
    }
}
