package com.sshen.spring6.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Title: Di
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/5 16:57
 * @Version: 1.0.0
 * @Description: 属性注入
 */
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Di {
}
