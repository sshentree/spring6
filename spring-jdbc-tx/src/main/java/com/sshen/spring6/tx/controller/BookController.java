package com.sshen.spring6.tx.controller;

import com.sshen.spring6.tx.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * @Title: BookController
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/9 20:20
 * @Version: 1.0.0
 * @Description:
 */
@Controller
public class BookController {

    @Resource
    private BookService bookService;

    /**
     * 买书
     *
     * @param userId 用户id
     * @param bookId 图书id
     */
    public void bugBook(Integer userId, Integer bookId) {
        bookService.bugBook(userId, bookId);
    }

    /**
     * 买书
     *
     * @param userId 用户id
     * @param bookIds 图书id
     */
    public void bugBooks(Integer userId, Integer[] bookIds) {
        bookService.bugBooks(userId, bookIds);
    }
}
