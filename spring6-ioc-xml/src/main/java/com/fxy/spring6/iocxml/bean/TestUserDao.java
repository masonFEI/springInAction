/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.spring6.iocxml.bean;

import com.fxy.spring6.iocxml.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestUserDao
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-29 20:23
 */
public class TestUserDao {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 根据类型获取接口对应bean

        // 如果一个接口有多个实现类，这些实现类都配置了bean，根据接口类型不能获取bean，因为bean不唯一
        UserDao userDao = context.getBean(UserDao.class);

        System.out.println(userDao);

        userDao.run();
    }
}
