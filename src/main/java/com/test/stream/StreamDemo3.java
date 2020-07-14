package com.test.stream;

import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {

        /*
            concat  将两个流合并为一个流
         */
        Stream<String> stream = Stream.of("1", "2");
        Stream<String> stream1 = Stream.of("3", "4");

        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(s -> System.out.println(s));
    }
}
