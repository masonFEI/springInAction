/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.spring6.iocxml.life;

/**
 * MyBean
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-11-02 19:55
 */
public class MyBean2 {

    public MyBean2() {

        System.out.println("MyBean2-constructor-111");
    }

    public void init() {
        System.out.println("MyBean2 init-1111");
    }

    public void destroy() {
        System.out.println("MyBean2 destroy-111");
    }

}
