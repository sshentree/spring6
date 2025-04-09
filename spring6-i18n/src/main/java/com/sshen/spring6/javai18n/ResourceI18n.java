package com.sshen.spring6.javai18n;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Title: ResourceI18n
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/23 20:22
 * @Version: 1.0.0
 * @Description:
 */
public class ResourceI18n {

    /**
     * java本身的国际化
     *
     * @param args
     */
    public static void main(String[] args) {
        // 作用：
        // 标识语言、国家/地区的组合（如 zh_CN 表示中文-中国，en_US 表示英语-美国）。
        // 创建 Locale 对象（中国中文）
        Locale cnLocale = new Locale("zh", "CN");

        Locale gbLocale = new Locale("en", "GB");

        /**
         * 文件命名规则：
         *
         *     基础名 + 语言 + 国家（如 messages_zh_CN.properties）。
         *     层级匹配：优先加载最精确的资源，缺失时回退到默认文件（如 messages.properties）。
         */
        ResourceBundle bundleCN = ResourceBundle.getBundle("message", cnLocale);
        System.out.println(bundleCN.getString("country"));

        ResourceBundle bundleGB = ResourceBundle.getBundle("message", gbLocale);
        System.out.println(bundleGB.getString("country"));

        // 格式化货币
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(currencyFormat.format(1234.567)); // 输出 $1,234.56

        // 格式化日期
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, cnLocale);
        System.out.println(dateFormat.format(new Date()));

        // 格式化日期时间
        DateFormat dateTimeFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, cnLocale);
        System.out.println(dateTimeFormat.format(new Date()));

        /**
         * 消息拼接：MessageFormat（支持占位符动态替换）。
         */
        String pattern = "你好，{0}！今天是{1}。";
        Object[] params = {"张三", new Date()};
        String message = MessageFormat.format(pattern, params);
        System.out.println(message);
    }

}
