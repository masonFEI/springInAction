/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.spring6;

/**
 * User
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-26 23:28
 */
public class User {

    public User() {
        System.out.println("0:无参数构造");
    }

    public void add() {
        System.out.println("add");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }

}
