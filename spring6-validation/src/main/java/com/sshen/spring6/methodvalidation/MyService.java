package com.sshen.spring6.methodvalidation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @Title: MyService
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/8 22:50
 * @Version: 1.0.0
 * @Description:
 */
@Service
@Validated // 只能作用在类上，在service层中与校验注解结合使用
public class MyService {
    @Validated
    public void validate(@NotNull @Valid User user) {
        System.out.println(user);
    }

//    @Validated
    public void validate(@NotEmpty String name) {
        System.out.println(name);
    }
}
