package com.sshen.spring6.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Title: SelfBean
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/5 16:58
 * @Version: 1.0.0
 * @Description: bean管理
 */
@Target(value = {ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SelfBean {
}
