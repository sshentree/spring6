package com.sshen.spring6.di;

/**
 * @Title: Book
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/7 17:18
 * @Version: 1.0.0
 * @Description:
 */
public class Book {

    private String name;

    private String author;

    private String other;

    public Book() {
        System.out.println("无参构造器......");
    }

    public Book(String name, String author) {
        System.out.println("有参构造器......");
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, String other) {
        System.out.println("有参构造器注入！");
        this.name = name;
        this.author = author;
        this.other = other;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setter name......");
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        System.out.println("setter author......");
        this.author = author;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", other='" + other + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setName("活着");
        book1.setAuthor("余华");
        System.out.println(book1);

        Book book2 = new Book("小孩", "大兵");
        System.out.println(book2);
    }

}
