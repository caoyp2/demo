package com.test.annotation;

import java.lang.annotation.*;

/**
 * 元注解
 * @Target(ElementType.TYPE)
 *      ElementType.TYPE  //注解作用与类上
 *      ElementType.METHOD  //注解作用于方法上
 *      ElementType.FIELD  //注解作用于成员变量上
 *
 * @Retention   //注解保留的阶段
 * @Retention(RetentionPolicy.RUNTIME)  //运行阶段都有效
 * @Retention(RetentionPolicy.SOURCE)  //源码阶段有效
 * @Retention(RetentionPolicy.CLASS)  //编译阶段有效
 *
 *
 * @Documented //标识该注解在生成api文档时有效
 * @Inherited //继承有效
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public  @interface MyAnno4 {
    String name();
}
