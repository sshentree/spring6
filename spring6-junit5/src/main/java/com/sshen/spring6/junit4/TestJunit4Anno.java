package com.sshen.spring6.junit4;

import com.sshen.spring6.Config;
import com.sshen.spring6.User;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @Title: TestJunit4Anno
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/2 12:02
 * @Version: 1.0.0
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {Config.class}, loader = AnnotationConfigContextLoader.class)
@ContextConfiguration(classes = {Config.class})
public class TestJunit4Anno {

    @Resource
    private User user;


    @Test
    public void test5() {
        System.out.println(user);
        user.run();
    }
}
