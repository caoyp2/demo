package com.test.annotation;

/**
 * 注解
 * JDK自带注解
 * @Deprecated   //标识注解的类或方法已过时
 * @SuppressWarnings("all")  //表示强制忽略警告
 *
 *
 * 注解格式
 *     public  @interface 注解名称 {
 *         属性列表
 *     }
 *
 *  属性列表只能支持以下类型：
 *      1、基本类型
 *      2、String
 *      3、枚举
 *      4、注解
 *      5、数组
 *
 */

public @interface MyAnno {

    String name();
    int age();
    MyAnno2 anno();
    Person p();
    String[] show();
}
