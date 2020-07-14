package com.test.annotation.actual;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException {

        Class<Calculator> calculatorClass = Calculator.class;
        Object obj = calculatorClass.newInstance();
        Method[] declaredMethods = calculatorClass.getDeclaredMethods();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));
        int count = 0;
        for(Method method : declaredMethods){
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(obj);
                } catch (Exception e) {
                    bufferedWriter.write("异常方法为： " + method.getName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常类型为： " + e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常信息为： " + e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("--------------------");
                    bufferedWriter.newLine();
                    count ++;
                }
            }
        }
        bufferedWriter.write("本次共发现 " + count + " 个异常！");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
