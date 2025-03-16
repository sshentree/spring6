package com.sshen.spring6.tx;

import com.sshen.spring6.tx.controller.BookController;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Title: TestBookTx
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/9 21:12
 * @Version: 1.0.0
 * @Description:
 */
@SpringJUnitConfig(locations = {"classpath:bean.xml"})
public class TestBookTx {

    @Resource
    private BookController bookController;

    /**
     * 事务验证
     */
    @Test
    public void test1() {
        bookController.bugBook(1, 1);
    }

    /**
     * 事务的传播性
     *
     *
     */
    @Test
    public void test2() {
        bookController.bugBooks(1, new Integer[]{1, 2});
    }

}
