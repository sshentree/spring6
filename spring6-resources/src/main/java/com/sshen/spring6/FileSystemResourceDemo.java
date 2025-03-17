package com.sshen.spring6;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * @Title: FileSystemResourceDemo
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/17 23:27
 * @Version: 1.0.0
 * @Description:
 */
public class FileSystemResourceDemo {

    public static void loadFileSystemResource(String path) {

        FileSystemResource fileSystemResource = new FileSystemResource(path);

        System.out.println(fileSystemResource.getPath());
        System.out.println(fileSystemResource.getFilename());

        //  获取文件内容
        InputStream in = null;
        int bytesRead;
        StringBuilder sb = new StringBuilder();
        try {
            in = fileSystemResource.getInputStream();
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
        // 绝对路径
//        loadFileSystemResource("D:\\project\\idea\\spring6\\spring6-resources\\src\\main\\resources\\spring.txt");

        // 相对路径（读取根路径下文件）
        loadFileSystemResource("README.md");
    }
}
