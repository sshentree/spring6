package com.sshen.spring6.tx.service;

/**
 * @Title: BookService
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/9 20:19
 * @Version: 1.0.0
 * @Description:
 */
public interface BookService {

    void bugBook(Integer userId, Integer bookId);

    void bugBooks(Integer userId, Integer[] bookIds);
}
