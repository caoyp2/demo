package com.test.homework;

public class StringWork {
    public static void main(String[] args) {

        String str = "jdflajfaldjfadf你好,,,你好，dfad";
        String find = "你好";
        int count = 0;
        int index = 0;

        while((index = str.indexOf(find,index)) != -1){
            index = index + find.length();
            count ++;
        }

        System.out.println("统计个数为：" + count);
    }
}
