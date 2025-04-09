package com.sshen.spring6.methodvalidation;

import com.sshen.spring6.selfvalidation.NotBlankSpace;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.stereotype.Component;

/**
 * @Title: User
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/8 22:39
 * @Version: 1.0.0
 * @Description:
 */
@Component
public class User {

    @NotEmpty(message = "name不能为空！")
    private String name;

    @NotNull(message = "年龄不能为空！")
    @Min(value = 0, message = "年龄不能小于0！")
    @Max(value = 200, message = "年龄不能大于200！")
    private Integer age;


    @NotBlank(message = "手机号不能为空！")
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机号非法！")
    private String phone;

    /**
     * 验证自定义的校验注解
     * 字符串中不能有空格
     */
    @NotBlankSpace(message = "备注不能有空格！")
    private String remark;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
