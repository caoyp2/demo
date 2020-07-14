package com.test.annotation.actual;

public class Calculator {

    @Check
    public void add(){
        System.out.println(1 + 1);
    }

    @Check
    public void sub(){
        System.out.println(1 - 1);
    }

    @Check
    public void chenfa(){
        System.out.println(1 * 1);
    }

    @Check
    public void div(){
        System.out.println(1/0);
    }

    @Check
    public void show(){

        String str = null;
        str.length();
    }
}
