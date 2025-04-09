package com.sshen.spring6.beanvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Set;

/**
 * @Title: Test
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/6 18:54
 * @Version: 1.0.0
 * @Description:
 */
public class Test_1 {

    @Test
    public void test() {

        // 创建 Spring 上下文
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);

        User user = new User();
        user.setName("tom");
        user.setAge(-1);
        // 手动调用其 afterPropertiesSet()方法，触发底层校验器的完整配置（但不推荐！）
//        LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
//        factoryBean.afterPropertiesSet(); // 手动触发初始化
//        Validator validator = factoryBean.getValidator();

        Validator validator = context.getBean(Validator.class);
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        if (!violations.isEmpty()) {
            for (ConstraintViolation<User> violation : violations) {
                // 打印核心信息
                System.out.println(
                        "属性: " + violation.getPropertyPath() +
                                ", 错误: " + violation.getMessage() +
                                ", 无效值: [" + violation.getInvalidValue() + "]"
                );
            }
        } else {
            System.out.println("数据正常！");
        }

    }
}
