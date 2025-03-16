package com.sshen.spring6.junit5;

import com.sshen.spring6.Config;
import com.sshen.spring6.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Title: TestJunit5Anno
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/2 12:07
 * @Version: 1.0.0
 * @Description:
 */
@SpringJUnitConfig(classes = {Config.class})
public class TestJunit5Anno {

    @Resource
    private User user;


    @Test
    public void test5() {
        System.out.println(user);
        user.run();
    }
}
