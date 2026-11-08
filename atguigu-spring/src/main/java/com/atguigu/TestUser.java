/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.atguigu;

import com.atguigu.bean.AnnotationApplicationContext;
import com.atguigu.bean.ApplicationContext;
import com.atguigu.service.UserService;

/**
 * TestUser
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-11-08 16:21
 */
public class TestUser {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationApplicationContext("com.atguigu");

        UserService userService = (UserService)context.getBean(UserService.class);
        userService.add();
    }

}
