package com.sshen.spring6.dao.impl;

import com.sshen.spring6.anno.SelfBean;
import com.sshen.spring6.dao.UserDao;

/**
 * @Title: UserDaoImpl
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/5 16:54
 * @Version: 1.0.0
 * @Description:
 */
@SelfBean
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("userDao 执行方法 addUser");
    }
}
