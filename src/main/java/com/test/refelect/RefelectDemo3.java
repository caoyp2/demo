package com.test.refelect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

public class RefelectDemo3 {
    /*
        获取构造方法
        cla.getConstructors()  //获取public修饰的构造方法
        getDeclaredConstructors //获取全部的构造方法

     */
    public static void main(String[] args) {
        try {
            Class cla = Class.forName("com.test.refelect.Student");

            Constructor[] declaredConstructors = cla.getDeclaredConstructors();//获取全部的构造方法
            for(Constructor constructor : declaredConstructors){
                System.out.println(constructor);
            }

            Constructor declaredConstructor = cla.getDeclaredConstructor(String.class, int.class);
            declaredConstructor.setAccessible(true);
            Student student = (Student) declaredConstructor.newInstance("张三", 20);
            System.out.println(student);

            //获取构造方法的参数
            System.out.println("获取方法参数=========");
            Type[] genericParameterTypes = declaredConstructor.getGenericParameterTypes();
            for(Type type : genericParameterTypes){
                System.out.println(type);
            }

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
