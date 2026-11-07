/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * AnnotationApplicationContext
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-11-07 12:45
 */
public class AnnotationApplicationContext implements ApplicationContext {

    // 创建map集合，放bean对象
    private final Map<Class, Object> beanFactory = new HashMap<>();

    // 返回对象
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    // 设置包扫描规则
    // 当前包及其子包，哪个类有@Bean注解，把这个类通过反射实例化
    // 创建有参构造，传递包路径
    public AnnotationApplicationContext(String basePackage) {

    }

}
