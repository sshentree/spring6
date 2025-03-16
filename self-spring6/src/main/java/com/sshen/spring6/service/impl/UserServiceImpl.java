package com.sshen.spring6.service.impl;

import com.sshen.spring6.anno.Di;
import com.sshen.spring6.anno.SelfBean;
import com.sshen.spring6.dao.UserDao;
import com.sshen.spring6.service.UserService;

/**
 * @Title: UserServiceImpl
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/5 16:54
 * @Version: 1.0.0
 * @Description:
 */
@SelfBean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void addUser() {
        System.out.println("执行 service......");
        userDao.addUser();
    }
}
