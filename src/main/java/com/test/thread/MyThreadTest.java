package com.test.thread;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();

        myThread.start();
        myThread1.start();
    }
}
