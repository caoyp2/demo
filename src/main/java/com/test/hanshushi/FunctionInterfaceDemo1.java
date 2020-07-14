package com.test.hanshushi;

public class FunctionInterfaceDemo1 {

    public static  void  invokeMethod(MyFunctionInterface myFunctionInterface){
        myFunctionInterface.myMethod();
    }

    public static void main(String[] args) {
        invokeMethod(() -> { System.out.println("Lambda执行啦！");});
    }
}
