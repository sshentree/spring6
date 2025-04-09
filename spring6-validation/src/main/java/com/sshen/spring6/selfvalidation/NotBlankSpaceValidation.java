package com.sshen.spring6.selfvalidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;

/**
 * @Title: NotBlankSpaceValidation
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/9 23:14
 * @Version: 1.0.0
 * @Description:
 */
public class NotBlankSpaceValidation implements ConstraintValidator<NotBlankSpace ,String>  {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        // 字符串不是空，且字符串包含空格
        if (StringUtils.hasLength(s) && s.contains(" ")) {
            /**
             * 可以替换提示信息
             */
//            // 获取默认提示信息
//            String defaultMessageTemplate = constraintValidatorContext.getDefaultConstraintMessageTemplate();
//            System.out.println("default message:" + defaultMessageTemplate);
//            // 禁用默认提示信息
//            constraintValidatorContext.disableDefaultConstraintViolation();
//            // 设置提示信息
//            constraintValidatorContext.buildConstraintViolationWithTemplate("can not contains blank!")
//                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
