package com.test.stream;

import org.openqa.selenium.json.JsonOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * stream api (jdk 1.8以后的)
 *
 */
public class StreamDemo1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("周芷若");

        /**
         * filter方法，过滤流中的元素
         */
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out :: println);
    }
}
