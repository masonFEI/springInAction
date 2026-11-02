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
public class MyBean {

    private String name;

    public void setName(String name) {
        System.out.println("MyBean1-setName:" + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MyBean() {
        System.out.println("MyBean1-constructor-111");
    }

    public void init() {
        System.out.println("MyBean1 init-1111");
    }

    public void destroy() {
        System.out.println("MyBean1 destroy-111");
    }

}
