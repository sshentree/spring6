package com.sshen.spring6.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Title: LogAspects
 * @Author: shendez@163.com
 * @CreateTime: 2025/2/25 23:01
 * @Version: 1.0.0
 * @Description: 切面类、IOC容器组件，spring-aop支持两种代理方式
 */
@Component
@Aspect
public class LogAspect {

    // 设置切入点和通知类型
    // 切入点：目标方法
    // 通知类型：前置、返回、异常、后置、环绕
    // @Before(value="切入点表达式配置切入点")
    // @AfterReturning
    // @AfterThrowing
    // @After()
    // @Around()

//    @Before(value = "execution(public int com.sshen.spring6.annoaop.CalculatorImpl.add(..))")
    @Before(value = "execution(public int com.sshen.spring6.annoaop.CalculatorImpl.add(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("目标方法参数：" + Arrays.toString(args));
        System.out.println(methodName + "：方法的前置通知");
    }

    @AfterThrowing(value = "execution(public * com.sshen.spring6.annoaop.CalculatorImpl.*(..))", throwing = "e")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception e) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("异常通知获取目标方法异常：" + e.getMessage());
        System.out.println(methodName + "：方法的异常通知");
    }

    @AfterReturning(value = "execution(public * com.sshen.spring6.annoaop.CalculatorImpl.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("返回通知获取目标方法结果：" + result);
        System.out.println(methodName + "：方法的返回通知");
    }

//    @After(value = "execution(public * com.sshen.spring6.annoaop.CalculatorImpl.*(..))")
    @After(value = "pointCut()") // 使用切入点表达式
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
//    @Around(value = "execution(public * com.sshen.spring6.annoaop.CalculatorImpl.*(..))")
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

    /**
     * 自定义一个公共切面表达式
     *
     */
    @Pointcut(value = "execution(public * com.sshen.spring6.annoaop.CalculatorImpl.*(..))")
    public void pointCut() {

    }

}
