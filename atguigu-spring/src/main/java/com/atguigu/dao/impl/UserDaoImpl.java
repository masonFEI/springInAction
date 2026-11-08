/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.atguigu.dao.impl;

import com.atguigu.anno.Bean;
import com.atguigu.dao.UserDao;

/**
 * UserDaoImpl
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-11-07 12:28
 */
@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao.... add");
    }
}
