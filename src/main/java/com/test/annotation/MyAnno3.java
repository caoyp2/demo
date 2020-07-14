package com.test.annotation;

/**
 * 对注解赋值
 * @MyAnno3(name = "zhangsan")   //name是注解中的属性
 * public class AnnoDemo3 {
 * }
 * 注解中只有一个属性时，对属性赋值时可以省略属性名，直接写值
 */
public @interface MyAnno3 {
    String name();
}
