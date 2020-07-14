package com.test.thread;

public class MyRunnable implements Runnable {

    public MyRunnable() {
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i ++){
            System.out.println(Thread.currentThread() + ":" + i);
        }
    }
}
