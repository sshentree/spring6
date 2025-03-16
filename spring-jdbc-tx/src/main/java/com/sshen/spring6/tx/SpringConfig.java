package com.sshen.spring6.tx;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Title: SpringConfig
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/16 16:42
 * @Version: 1.0.0
 * @Description: 替代配置文件
 */
@Configuration // spring的配置类
@ComponentScan(value = {"com.sshen.spring6"}) // 包扫描
@EnableTransactionManagement // 开启事务注解
public class SpringConfig {

    /**
     * 注册数据源
     *
     * @return
     */
    @Bean(value = "druidDataSource")
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://81.70.185.229:4306/spring?characterEncoding=utf8&useSSL=false&useUnicode=true");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("mysql3306");
        return druidDataSource;
    }

    /**
     * 注册jdbcTemplate
     *
     * 在 @Bean 方法中，可以通过方法参数自动注入其他 Bean
     * 在 Spring 中，当你在 @Bean 方法中通过参数注入其他 Bean 时，默认情况下是基于类型（Type）进行自动装配。
     * 但如果有多个相同类型的 Bean 存在，Spring 会结合**参数名称（Parameter Name）**来匹配 Bean 的名称，解决歧义。
     *
     * 如果参数名称与 Bean 名称不一致，或者需要更明确的控制，可以通过 @Qualifier 注解直接指定 Bean 名称：
     * @Qualifier("druidDataSource") DataSource dataSource
     *
     * @param dataSource 依赖（容器中的组件）
     * @return
     */
    @Bean(value = "jdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("druidDataSource") DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    /**
     * 注册事务管理器
     *
     * @param dataSource 依赖（容器中的组件）
     * @return
     */
    @Bean(value = "transactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

}
