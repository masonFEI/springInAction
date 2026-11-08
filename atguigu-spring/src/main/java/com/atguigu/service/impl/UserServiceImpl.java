/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.atguigu.service.impl;

import com.atguigu.anno.Bean;
import com.atguigu.anno.Di;
import com.atguigu.dao.UserDao;
import com.atguigu.service.UserService;

/**
 * UserServiceImpl
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-11-07 12:27
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service....");

        // 调用dao的方法
        userDao.add();
    }
}
