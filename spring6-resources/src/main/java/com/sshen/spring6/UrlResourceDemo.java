package com.sshen.spring6;

import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @Title: UrlResourceDemo
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/17 23:03
 * @Version: 1.0.0
 * @Description: 演示
 */
public class UrlResourceDemo {

    /**
     * 访问前缀为http、file
     *
     * @param path
     */
    public static void loadUrlResource(String path) throws IOException {
        // 创建Resource实现类对象UrlResource
        UrlResource urlResource = new UrlResource(path);
        // 获取资源信息
        System.out.println(urlResource.getURL());
        System.out.println(urlResource.getFilename());
        System.out.println(urlResource.getInputStream().read());
    }

    public static void main(String[] args) throws IOException {
        // http前缀
//        loadUrlResource("http://www.baidu.com");

        // file前缀（相对路径时，文件必须在项目根路径下）
//        loadUrlResource("file:README.md");
//        loadUrlResource("file:D:\\project\\idea\\spring6\\README.md");
    }
}
