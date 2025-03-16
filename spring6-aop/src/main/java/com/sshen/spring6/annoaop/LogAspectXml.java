package com.sshen.spring6.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Title: LogAspects
 * @Author: shendez@163.com
 * @CreateTime: 2025/2/25 23:01
 * @Version: 1.0.0
 * @Description: 切面类，使用xml配置文件
 */
@Component
public class LogAspectXml {

    /**
     * 前置通知
     * @param joinPoint
     */
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("目标方法参数：" + Arrays.toString(args));
        System.out.println(methodName + "：方法的前置通知");
    }

    /**
     * 异常通知
     *
     * @param joinPoint
     * @param e
     */
    public void afterThrowingMethod(JoinPoint joinPoint, Exception e) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("异常通知获取目标方法异常：" + e.getMessage());
        System.out.println(methodName + "：方法的异常通知");
    }

    /**
     * 返回通知
     *
     * @param joinPoint
     * @param result
     */
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("返回通知获取目标方法结果：" + result);
        System.out.println(methodName + "：方法的返回通知");
    }

    /**
     * 后置通知
     *
     * @param joinPoint
     */
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("目标方法参数：" + Arrays.toString(args));
        System.out.println(methodName + "：方法的后置通知");
    }

    /**
     * 环绕方法：
     * 1)目标方法有返回值时，环绕通知也需要有返回值；
     * 2)目标方法无返回值时，环绕通知返回值可有可无
     *
     * @param joinPoint
     * @return
     */

    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + "环绕通知");
        Object[] args = joinPoint.getArgs();
        System.out.println("目标方法参数：" + Arrays.toString(args));
        try {
            System.out.println("前置方法");
            result = joinPoint.proceed(args); // 调用目标方法
            System.out.println("返回通知：" + result);
        } catch (Throwable e) {
            System.out.println("异常通知：" + e.getMessage());
        } finally {
            System.out.println("后置方法");
        }

        return result;
    }

}
