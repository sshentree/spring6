package com.sshen.spring6.autowired.controller;

import com.sshen.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @Title: UserController
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/22 14:52
 * @Version: 1.0.0
 * @Description:
 */
@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("controller：添加用户信息");
        userService.addUserService();
    }
}
