package com.sshen.spring6.autowired.service;

import com.sshen.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title: UserServiceImpl
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/22 14:58
 * @Version: 1.0.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUserService() {
        System.out.println("UserService实现类：添加用户信息");
        userDao.addUserDao();
    }
}
