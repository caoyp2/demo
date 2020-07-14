package com.test.stream;

import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        String[] str = {"1","2","3","4"};
        Stream<String> stream = Stream.of(str);
        Stream<Integer> stream1 = stream.map(s -> Integer.parseInt(s)); //map将一种类型转换为另一种类型的数据
//        stream1.forEach(s -> System.out.println(s + 10));  //遍历元素
//        System.out.println(stream1.count());  //统计流中元素个数

        /*
            limit取流中的前几个元素
         */
//        stream1.limit(2).forEach(s -> System.out.println(s));

        /*
            skip 跳过前几个元素
         */
        stream1.skip(2).forEach(s -> System.out.println(s));
    }
}
