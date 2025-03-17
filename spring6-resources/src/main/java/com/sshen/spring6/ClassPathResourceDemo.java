package com.sshen.spring6;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * @Title: ClassPathResourceDemo
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/17 23:15
 * @Version: 1.0.0
 * @Description: 访问类路径下资源
 */
public class ClassPathResourceDemo {

    public static void loadClassPathResource(String path) {

        ClassPathResource classPathResource = new ClassPathResource(path);

        System.out.println(classPathResource.getPath());
        System.out.println(classPathResource.getFilename());

        //  获取文件内容
        InputStream in = null;
        int bytesRead;
        StringBuilder sb = new StringBuilder();
        try {
            in = classPathResource.getInputStream();
            byte[] b = new byte[1024];
            while ((bytesRead = in.read(b)) != -1) {
                sb.append(new String(b, 0, bytesRead, StandardCharsets.UTF_8));
                System.out.println(sb.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (Objects.nonNull(in)) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // 类路径下资源（相对路径）
        loadClassPathResource("spring.txt");
    }

}
