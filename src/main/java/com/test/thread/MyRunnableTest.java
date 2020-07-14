package com.test.thread;

public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable,"小强");

        MyRunnable myRunnable1 = new MyRunnable();
        Thread thread2 = new Thread(myRunnable1,"旺财");

        thread1.start();
        thread2.start();
    }
}
