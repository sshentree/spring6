package com.sshen.spring6.validator;

import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Objects;

/**
 * @Title: UserValidator
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/2 20:06
 * @Version: 1.0.0
 * @Description: 实现Validator接口对对象进行校验，并实现其中两个方法
 */
public class UserValidator implements Validator {

    /**
     * 判断类型是否符合规范
     *
     * @param clazz the {@link Class} that this {@link Validator} is
     *              being asked if it can {@link #validate(Object, Errors) validate}
     * @return
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        /**
         * 参数：
         *    target：待校验的对象。
         *    errors：存储校验错误信息。
         * 校验逻辑：
         *    使用ValidationUtils简化空值、长度等基础校验。
         *    自定义复杂校验逻辑（如格式、业务规则）。
         */
        if (Objects.nonNull(target)) {
            // rejectIfEmpty 会检查目标字段是否为 null 或逻辑空值（如空字符串、空集合等）
            // 仅检查空性：无法校验集合内部元素的合法性（如元素内容是否符合规则）
            ValidationUtils.rejectIfEmpty(errors, "userName", "userName.empty", "人员姓名不能为空！");
            User user = (User) target;
            if (Objects.isNull(user.getAge())) {
                errors.rejectValue("age", "age.empty", "年龄不能为空!");
            } else if (user.getAge() < 0) {
                errors.rejectValue("age", "age.negative", "年龄不能为负数!");
            } else {}
        } else {
            errors.reject("bean is null", "对象不能为空！");
        }
    }

    public static void main(String[] args) {
        Object obj = null;
        // Spring中的参数非空校验，测试环境、生产环境都可以使用
        Assert.notNull(obj, "object must not be null");

        // java中的断言，默认禁用（需JVM参数 -ea 开启），测试化境使用
        assert Objects.nonNull(obj) : "object must not be null";
    }

}
