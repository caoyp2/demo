package com.test.refelect;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class RefelectDemo2 {
    /*
        反射获取成员属性
        getFields()  //获取public修饰的成员属性
        getFields(String name) //获取指定的public修饰的成员属性
        getDeclaredFields()  //获取全部的成员属性
        getDeclaredFields()  //获取全部的成员属性
     */

    public static void main(String[] args) {
        try {
            Class cla = Class.forName("com.test.refelect.Student");
            Field[] fields = cla.getFields();
            for(Field field : fields){
                System.out.println(field);
            }
            System.out.println("======================");
            Field[] declaredFields = cla.getDeclaredFields();
            for(Field field : declaredFields){
                System.out.println(field);
            }

            Student student = new Student();
            Field field3 = cla.getDeclaredField("name");
            field3.setAccessible(true);
            field3.set(student,"张三"); //设置值
            field3.get(student); //获取值

            Type genericType = field3.getGenericType(); //获取成员变量的类型
            System.out.println(genericType);

            System.out.println(student);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
