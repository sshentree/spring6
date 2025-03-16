package com.sshen.spring6;

import com.sshen.spring6.bean.SelfAnnoApplicationContext;
import com.sshen.spring6.bean.SelfApplicationContext;
import com.sshen.spring6.dao.UserDao;
import com.sshen.spring6.service.UserService;
import org.junit.Test;

/**
 * @Title: TestUser
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/5 21:16
 * @Version: 1.0.0
 * @Description:
 */
public class TestUser {

    @Test
    public void test() {
        SelfApplicationContext applicationContext = new SelfAnnoApplicationContext("com.sshen.spring6");
        UserService userService = (UserService)applicationContext.getBean(UserService.class);
        userService.addUser();
    }
}
