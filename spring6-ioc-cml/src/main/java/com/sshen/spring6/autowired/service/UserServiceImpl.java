package com.sshen.spring6.autowired.service;

import com.sshen.spring6.autowired.dao.UserDao;

/**
 * @Title: UserServiceImpl
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/22 14:58
 * @Version: 1.0.0
 * @Description:
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("UserService实现类：添加用户信息");
        userDao.addUserDao();
    }
}
