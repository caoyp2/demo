package com.test.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Integer[] arr = {10,20,12,23,8};

//        Arrays.sort(arr, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
//        Arrays.sort(arr,new LambdaDemo2Interface());

        Arrays.sort(arr,(o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(arr));


    }
}
