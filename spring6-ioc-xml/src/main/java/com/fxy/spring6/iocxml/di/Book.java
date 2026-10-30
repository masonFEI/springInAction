/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.spring6.iocxml.di;

/**
 * Book
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-30 19:48
 */
public class Book {


    private String bname;

    private String author;

    private String others;

    public Book() {
    }

    // 有参数构造器
    public Book(String bname, String author, String others) {
        this.bname = bname;
        this.author = author;
        this.others = others;
    }

    // 生成set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // set方式
        Book book = new Book();
        book.setBname("Java");
        book.setAuthor("张三");
        System.out.println(book);

        // 构造器
        Book book1 = new Book("c++", "atguigu", "111");

    }
}
