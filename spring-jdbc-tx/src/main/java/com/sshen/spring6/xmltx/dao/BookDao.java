package com.sshen.spring6.xmltx.dao;

import java.math.BigDecimal;

/**
 * @Title: BookDao
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/9 20:20
 * @Version: 1.0.0
 * @Description:
 */
public interface BookDao {

    /**
     * 根据图书id获取图书价格
     *
     * @param bookId
     * @return
     */
    BigDecimal getBookPriceByBookId(Integer bookId);

    /**
     * 根据图书id更新图书库存量（减一）
     *
     * @param bookId
     */
    void updateStock(Integer bookId);

    /**
     * 根据用户id和图书价格更细用户账户余额（减去图书价格）
     *
     * @param userId
     * @param price
     */
    void updateUserBalance(Integer userId, BigDecimal price);
}
