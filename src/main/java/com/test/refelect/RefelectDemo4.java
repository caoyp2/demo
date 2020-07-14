package com.test.refelect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class RefelectDemo4 {
    /*
        获取方法
        getMethods()  //获取public方法
        getDeclaredMethods() //获取全部方法
     */
    public static void main(String[] args) {

        try {
            Class cla = Class.forName("com.test.refelect.Student");
            Method[] declaredMethods = cla.getDeclaredMethods();
            for(Method method : declaredMethods){
                System.out.println(method);
            }

            //获取指定的方法
            System.out.println("获取指定的方法");
            Method eat = cla.getDeclaredMethod("eat", String.class);
            Student student = new Student();
            eat.invoke(student,"水果");  //执行方法

            //获取返回值类型
            System.out.println("获取返回值类型");
            Type genericReturnType = eat.getGenericReturnType(); //获取返回值类型
            System.out.println(genericReturnType);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
