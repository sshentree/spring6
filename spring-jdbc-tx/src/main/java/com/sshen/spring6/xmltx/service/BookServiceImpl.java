package com.sshen.spring6.xmltx.service;

import com.sshen.spring6.xmltx.dao.BookDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Title: BookServiceImpl
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/9 20:20
 * @Version: 1.0.0
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public void bugBook(Integer userId, Integer bookId) {
        // 根据图书的id查询图书价格
        BigDecimal price = bookDao.getBookPriceByBookId(bookId);
        // 更新图书的库存量（减一）
        bookDao.updateStock(bookId);
        // 更新更新用户的账户余额（减去图书的价格）
        bookDao.updateUserBalance(userId, price);
    }

    @Override
    public void bugBooks(Integer userId, Integer[] bookIds) {
        if (Objects.nonNull(bookIds) && bookIds.length > 0) {
            for (Integer bookId : bookIds) {
                bugBook(userId, bookId);
            }
        }
    }
}
