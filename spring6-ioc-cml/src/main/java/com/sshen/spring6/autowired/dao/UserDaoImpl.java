package com.sshen.spring6.autowired.dao;

/**
 * @Title: UserDaoImpl
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/22 14:55
 * @Version: 1.0.0
 * @Description:
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("userDao实现类：添加用户信息");
    }
}
