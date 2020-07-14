package com.test.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张强");
        list.add("宋远桥");

        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3)
                .map(s -> new Person(s)).forEach(person -> System.out.println(person));
    }
}
