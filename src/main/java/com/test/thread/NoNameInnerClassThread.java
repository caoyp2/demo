package com.test.thread;

public class NoNameInnerClassThread {

    public static void main(String[] args) {
        Runnable ra = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    System.out.println(i);
                }
            }
        };  //创建一个匿名内部类

        new Thread(ra,"匿名").start();
    }
}
