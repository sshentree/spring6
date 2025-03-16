package com.sshen.spring6.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Title: ProxyFactory
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/15 23:21
 * @Version: 1.0.0
 * @Description: 代理工厂
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {

        // 类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        // 目标类实现的接口数组
        Class<?>[] interfaces = target.getClass().getInterfaces();

        return Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + "方法入口参数：" + Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println(method.getName() + "执行结果：" + result);
                return result;
            }
        });
    }
}
