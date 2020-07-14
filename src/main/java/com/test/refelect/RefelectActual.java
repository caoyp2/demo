package com.test.refelect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    反射的应用
 */
public class RefelectActual {
    public static void main(String[] args) {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("test.properties")));
            String classname = (String) properties.get("classname");
            System.out.println(classname);
            Class cla = Class.forName(classname);
            Student student = (Student) cla.newInstance();

            String method = (String) properties.get("method");
            Method declaredMethod = cla.getDeclaredMethod(method);
            declaredMethod.invoke(student);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
