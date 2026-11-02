/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.spring6.iocxml.life;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MyBeanPostTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-11-02 19:34
 */
public class MyBeanPostTest {


    @Test
    public void beanTest() {
        // 用 ConfigurableApplicationContext / ClassPathXmlApplicationContext 接住，
        // 只有它们才有 close()；ApplicationContext 接口本身没有声明该方法
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");

        MyBean bean1 = context.getBean("myBean1", MyBean.class);

        System.out.println(bean1);

        context.close();

    }

}
