package com.sshen.spring6.jdbc;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.ResultSet;
import java.util.List;

/**
 * @Title: JdbcTemplateTest
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/3 22:49
 * @Version: 1.0.0
 * @Description:
 */
@SpringJUnitConfig(locations = {"classpath:bean.xml"})
public class JdbcTemplateTest {

    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加、更新、删除，都是用update来完成
     */
    @Test
    public void testSave() {
        // 添加
        String insertStr = "insert into t_emp values(null, ?, ?, ?)";
        int insertRow = jdbcTemplate.update(insertStr, "赵六", 19, "女");
        System.out.println("插入" + insertRow + "行数据");
    }

    @Test
    public void testUpdate() {
        // 更新
        String updateStr = "update t_emp set sex = ? where id = ?";
        int updateRow = jdbcTemplate.update(updateStr, "女", 1);
        System.out.println("更新" + updateRow + "行数据");
    }

    @Test
    public void testDel() {
        // 删除
        String deleteStr = "delete from t_emp where id = ?";
        int deleteRow = jdbcTemplate.update(deleteStr, 1);
        System.out.println("删除" + deleteRow + "行数据");
    }

    /**
     * 查询对象
     */
    @Test
    public void testGetObject() {
        // 写法一
        /**
         * 自定义实现RowMapper接口中的唯一方法：T mapRow(ResultSet rs, int rowNum)
         * 其中rs是已经在RowMapperResultSetExtractor类中public List<T> extractData(ResultSet rs)方法中执行了rs.next()
         * ，所以RowMapper接口实现类方法中的参数是当前行数据。
         */
        String sql = "select * from t_emp where id = ?";
        Emp empResult1 = jdbcTemplate.queryForObject(sql,
                (rs, rowNum) -> {
                    Emp emp = null;
                    if (rowNum >= 0) {
                        emp = new Emp();
                        emp.setId(rs.getInt("id"));
                        emp.setName(rs.getString("name"));
                        emp.setAge(rs.getInt("age"));
                        emp.setSex(rs.getString("sex"));
                    }
                    return emp;
                }, 2);

        System.out.println("方法一：" + empResult1);

        // 方法二
        Emp empResult2 = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 2);
        System.out.println("方法二：" + empResult2);


    }

    /**
     * 查询返回集合
     */
    @Test
    public void testQueryList() {

        String sql = "select * from t_emp where id > ?";

        List<Emp> resultEmps1 = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(resultEmps1);

        /**
         * 集合自定义实现RowMapper接口，和获取对象一样。
         */
    }

    /**
     * 返回单位字段值，或统计数据
     */
    @Test
    public void testGetField() {
        // 查询返回集合
        String sql = "select count(*) from t_emp where id > ?";

        Long count = jdbcTemplate.queryForObject(sql, Long.class, 1);
        System.out.println(count);
    }

}
