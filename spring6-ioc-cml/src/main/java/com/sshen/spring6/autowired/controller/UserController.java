package com.sshen.spring6.autowired.controller;

import com.sshen.spring6.autowired.service.UserService;

/**
 * @Title: UserController
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/22 14:52
 * @Version: 1.0.0
 * @Description:
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("controller：添加用户信息");
        userService.addUserService();
    }
}
