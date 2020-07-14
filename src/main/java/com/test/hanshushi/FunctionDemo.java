package com.test.hanshushi;

import java.util.function.Function;

public class FunctionDemo {

    public static int applySomething(Function<String,Integer> function){
        return function.apply("10");
    }

    public static int andThenSomething(Function<String,Integer> one,Function<Integer,Integer> two){
        return one.andThen(two).apply("10");
    }

    public static void main(String[] args) {
        System.out.println(applySomething(s -> Integer.parseInt(s)) + 20);

        System.out.println(andThenSomething(s -> Integer.parseInt(s), s -> s*10));
    }
}
