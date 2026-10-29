/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.spring6.iocxml.bean;

/**
 * PersonUserDaoImpl
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-29 20:29
 */
public class PersonUserDaoImpl implements UserDao {

    @Override
    public void run() {
        System.out.println("PersonUserDaoImpl.run()");
    }
}
