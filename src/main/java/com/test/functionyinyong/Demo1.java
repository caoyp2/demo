package com.test.functionyinyong;

import org.openqa.selenium.json.JsonOutput;

public class Demo1 {

    public static void printSomething(Printable printable){
        printable.print("Hello world");
    }

    public static void main(String[] args) {
        /*
            lambda调用形式
         */
//        printSomething(str -> {
//            System.out.println(str);
//        });

        //方法引用
        printSomething(System.out :: println);

    }
}
