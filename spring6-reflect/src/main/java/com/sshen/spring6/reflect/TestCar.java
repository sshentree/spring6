package com.sshen.spring6.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Title: TestCar
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/29 18:01
 * @Version: 1.0.0
 * @Description:
 */
public class TestCar {

    /**
     * 获取Class对象多种方式
     */
    @Test
    public void test1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.类名.class
        Class aClass1 = Car.class;

        //2.对象.getClass()
        Class aClass2 = new Car().getClass();

        //3.Class.forName("类全路径")
        Class aClass3 = Class.forName("com.sshen.spring6.reflect.Car");

        // getDeclaredConstructor()可以获取所有访问级别的构造器

        // 实例化，调用无参构造器
        Car car1 = (Car) aClass3.getConstructor().newInstance();
        System.out.println(car1);

        // 实例化，调用有参构造器
        Constructor constructor = aClass3.getDeclaredConstructor(String.class, Integer.class, String.class);
        // 允许访问private级别构造器
        constructor.setAccessible(true);
        Car car2 = (Car) constructor.newInstance("保时捷", 4, "蓝色");
        System.out.println(car2);

    }

    /**
     * 获取构造方法
     */
    @Test
    public void test2() throws ClassNotFoundException {
        //Class.forName("类全路径")
        Class aClass = Class.forName("com.sshen.spring6.reflect.Car");
        // 获取所有访问级别的构造器
        Constructor[] constructors = aClass.getDeclaredConstructors();

        for (Constructor c : constructors) {
            System.out.println(c.getName() + "；参数个数：" + c.getParameterCount());
        }

    }

    /**
     * 获取属性
     */
    @Test
    public void test3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Class.forName("类全路径")
        Class aClass = Class.forName("com.sshen.spring6.reflect.Car");
        Car car = (Car) aClass.getDeclaredConstructor().newInstance();
        // 获取所有访问级别的构造器
        Field[] fields = aClass.getDeclaredFields();

        for (Field f : fields) {
            f.setAccessible(true);
            if (f.getName().equals("name")) {
                f.set(car, "布加迪");
            }
            if (f.getName().equals("age")) {
                f.set(car, 2);
            }
            if (f.getName().equals("color")) {
                f.set(car, "红色");
            }
        }

        System.out.println(car);

    }

    /**
     * 获取方法
     */
    @Test
    public void test4() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Class.forName("类全路径")
        Class aClass = Class.forName("com.sshen.spring6.reflect.Car");
        // 实例化，调用有参构造器
        Constructor constructor = aClass.getDeclaredConstructor(String.class, Integer.class, String.class);
        // 允许访问private级别构造器
        constructor.setAccessible(true);
        Car car = (Car) constructor.newInstance("保时捷", 4, "蓝色");

        // public方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            // 方法名称
            // 执行方法toString()
            if ("toString".equals(method.getName())) {
                System.out.println("执行方法：" + method.getName());
                String result = (String) method.invoke(car);
                System.out.println(result);
            }
        }

        // 所有方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if ("run".equals(method.getName())) {
                System.out.println("执行方法：" + method.getName());
                method.setAccessible(true);
                Object result = method.invoke(car);
                System.out.println(result);

            }
        }

    }

}
