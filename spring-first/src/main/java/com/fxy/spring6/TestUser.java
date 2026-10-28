/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestUser
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-26 23:48
 */
public class TestUser {

    // 创建logger
    private final Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        // 加载spring配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);

        // 使用对象调用方法进行测试
        user.add();

        // 写日志
        logger.info("### 执行调用成功了......");

    }


    @Test
    public void testUserObject1() throws Exception {
        Class<?> clazz = Class.forName("com.fxy.spring6.User");
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        user.add();
    }

}
