package com.sshen.spring6.validator;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @Title: Test
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/2 23:24
 * @Version: 1.0.0
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        // 创建User对象
        User user = new User();
        // 创建User的dataBinder
        DataBinder dataBinder = new DataBinder(user);
        // 设置校验器
        dataBinder.setValidator(new UserValidator());
        // 调用方法执行校验
        dataBinder.validate();
        // 获取校验结果
        BindingResult result = dataBinder.getBindingResult();
        System.out.println(result.getAllErrors());
    }
}
