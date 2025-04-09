package com.sshen.spring6;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @Title: ByteArrayResourceDemo
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/18 23:01
 * @Version: 1.0.0
 * @Description:
 */
public class ByteArrayResourceDemo {

    public static void loadByteArrayResource(String target) throws IOException {

        ByteArrayResource resource = new ByteArrayResource(target.getBytes(StandardCharsets.UTF_8));

        InputStream inputStream = resource.getInputStream();
        String s = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        System.out.println(s);
    }

    public static void main(String[] args) throws IOException {
        loadByteArrayResource("hello word");
    }
}
