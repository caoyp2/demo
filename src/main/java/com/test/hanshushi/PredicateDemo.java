package com.test.hanshushi;

import java.util.function.Predicate;

/**
 * 返回一个Boolean值
 */
public class PredicateDemo {

    public static boolean testSomething(Predicate<String> fun){
        return fun.test("assa");
    }

    /**
     * Predicate的与或非拼接
     * and or negate
     * @param one
     * @param two
     * @return
     */
    public static boolean andSomething(Predicate<String> one,Predicate<String> two){
        return one.and(two).test("Hello world");
    }

    public static void main(String[] args) {
        boolean result = testSomething(s -> { return s.length() > 5;});
        System.out.println(result);

        System.out.println(andSomething(s -> s.contains("Hello"),s -> s.contains("world")));
    }
}
