package com.test.hanshushi;

import java.util.function.Supplier;

public class SupplierDemo {

    public static String getString(Supplier<String> function){
        return function.get();
    }

    public static void main(String[] args) {
        String str = getString(() -> { return "aaa";});
        System.out.println(str);
    }
}
