package com.sshen.spring6.junit5;

import com.sshen.spring6.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Title: TestJunit5
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/2 11:39
 * @Version: 1.0.0
 * @Description:
 */

// 两种方式都可以
//@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:bean.xml")
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestJunit5 {

    @Resource
    private User user;


    @Test
    public void test5() {
        System.out.println(user);
        user.run();
    }

}
