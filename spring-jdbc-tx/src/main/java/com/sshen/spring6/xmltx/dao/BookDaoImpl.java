package com.sshen.spring6.xmltx.dao;

import jakarta.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @Title: BookDaoImpl
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/9 20:20
 * @Version: 1.0.0
 * @Description:
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public BigDecimal getBookPriceByBookId(Integer bookId) {
        String sql = "select a.price from t_book a where a.book_id = ?";
        BigDecimal price = jdbcTemplate.queryForObject(sql, BigDecimal.class, bookId);
        return price;
    }

    @Override
    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock = stock - 1 where book_id = ?";
        int rowNumber = jdbcTemplate.update(sql, bookId);
        System.out.println("影响行数：" + rowNumber);

    }

    @Override
    public void updateUserBalance(Integer userId, BigDecimal price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";
        int rowNumber = jdbcTemplate.update(sql, price, userId);
        System.out.println("影响行数：" + rowNumber);
    }
}
