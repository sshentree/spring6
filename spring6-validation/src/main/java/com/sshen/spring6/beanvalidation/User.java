package com.sshen.spring6.beanvalidation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

/**
 * @Title: User
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/6 18:14
 * @Version: 1.0.0
 * @Description:
 */
@Component
public class User {

    @NotEmpty(message = "姓名不能为空！")
    private String name;

    @NotNull(message = "年龄不能为空！")
    @Min(value = 1, message = "年龄不能小于0！")
    @Max(value = 200, message = "年龄不能大于200！")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
