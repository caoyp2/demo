package com.test.hanshushi;

import java.util.function.Supplier;

public class SupplierDemo2 {

    public static int getMax(Supplier<Integer> function){
        return function.get();
    }


    public static void main(String[] args) {
        int[] arr = {12,23,13,6,32};

        int result = getMax(() -> {
           int max = arr[0];
           for(int i : arr){
               if(i > max){
                   max = i;
               }
           }
           return max;
        });
        System.out.println(result);
    }
}
