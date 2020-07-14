package com.test.annotation.actual;


@pro(classname = "com.test.annotation.actual.Cat",method = "eat")
public class AnnoDemo {
    public static void main(String[] args) {

        Class<AnnoDemo> annoDemoClass = AnnoDemo.class;
        /**
         * 解析注解
         */
        pro annotation = annoDemoClass.getAnnotation(pro.class);
        /**
         * 获取注解中的属性值
         */
        String classname = annotation.classname();
        System.out.println(classname);
    }
}
