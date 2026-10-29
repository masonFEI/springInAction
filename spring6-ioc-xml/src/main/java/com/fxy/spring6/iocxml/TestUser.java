/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestUser
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-29 19:51
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 1.根据id获取bean
        User user1 = (User) context.getBean("user");
        System.out.println("1 根据id获取bean" + user1);

        // 2.根据类型获取bean,要求IoC容器中，指定类型的bean有且只有一个
        User user2 = context.getBean(User.class);
        System.out.println("2 根据类型获取bean" + user2);

        // 3.根据id和类型获取bean
        User user3 = context.getBean("user", User.class);
        System.out.println("3 根据id和类型获取bean" + user3);

    }

}
