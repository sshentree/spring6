package com.sshen.spring6.bean;

import com.sshen.spring6.anno.Di;
import com.sshen.spring6.anno.SelfBean;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Title: SelfAnnoApplicationContext
 * @Author: shendez@163.com
 * @CreateTime: 2025/1/5 17:14
 * @Version: 1.0.0
 * @Description:
 */
public class SelfAnnoApplicationContext implements SelfApplicationContext {

    /**
     * 存放bean容器
     */
    private Map<Class, Object> beanFactory = new HashMap<>();

    private String rootPath;

    @Override
    public <T> Object getBean(Class<T> tClass) {
        if (!beanFactory.isEmpty()) {
            for (Map.Entry<Class, Object> entry : beanFactory.entrySet()) {
                Class key = entry.getKey();
                // 判断tClass是不是key父类
                if (tClass.isAssignableFrom(key)) {
                    return entry.getValue();
                }
            }
        }

        return beanFactory.get(tClass);
    }

    /**
     * 设置包扫描规则，把有SelfBean注解的类通过反射实例化
     */
    public SelfAnnoApplicationContext(String basePackage) {
        try {
            String packagePath = basePackage.replace(".", File.separator);
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), StandardCharsets.UTF_8);
                // 设置根路径
                rootPath = filePath.substring(0, filePath.length() - basePackage.length());

                loadBean(new File(filePath));
                loadDi();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 模拟bean（组件）注册到IOC容器中
     *
     * @param file
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public void loadBean(File file) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (Objects.nonNull(file)) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (Objects.isNull(files) || files.length == 0) {
                    return;
                } else {
                    for (File child : files) {
                        loadBean(child);
                    }
                }
            } else {
                String fileAbsolutePath = file.getAbsolutePath().substring(this.rootPath.length() - 1);
                if (fileAbsolutePath.endsWith(".class")) {
                    int index = fileAbsolutePath.lastIndexOf(".class");
                    // 类全路径
                    String classPath = fileAbsolutePath.replace("\\", ".").substring(0, index);
                    Class aClass = Class.forName(classPath);
                    if (!aClass.isInterface()) {
                        // 不是接口判断类是否有SelfBean注解修改
                        SelfBean selfBean = (SelfBean) aClass.getAnnotation(SelfBean.class);
                        if (Objects.nonNull(selfBean)) {
                            // 实例化对象
                            Object instance = aClass.getDeclaredConstructor().newInstance();
                            System.out.println("加载：" + aClass.getName());
                            this.beanFactory.put(aClass, instance);
                        }
                    }
                }
            }
        }
    }

    /**
     * 模拟依赖注入
     */
    public void loadDi() throws IllegalAccessException {
        if (!beanFactory.isEmpty()) {
            for (Map.Entry<Class, Object> entry : beanFactory.entrySet()) {
                Object value = entry.getValue();
                Field[] fields = value.getClass().getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    // 获取属性上面的注解Di
                    Di di = field.getAnnotation(Di.class);
                    if (Objects.nonNull(di)) {
                        Class fieldClass = field.getType();
                        for (Map.Entry<Class, Object> temp : beanFactory.entrySet()) {
                            Class key = temp.getKey();
                            if (fieldClass.isAssignableFrom(key)) {
                                field.set(value, temp.getValue());
                            }
                        }
                    }
                }
            }
        }
    }

}
