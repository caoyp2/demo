package com.test.hanshushi;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void acceptSomething(Consumer<String> function){
        function.accept("Hello");
    }

    public static void ConsumeSomething(Consumer<String> one,Consumer<String> two){
        one.andThen(two).accept("Hello Word");
    }

    public static void main(String[] args) {
//        acceptSomething((a) -> System.out.println(a));
        ConsumeSomething(s -> System.out.println(s.toUpperCase()),s -> System.out.println(s.toLowerCase()));
    }
}
