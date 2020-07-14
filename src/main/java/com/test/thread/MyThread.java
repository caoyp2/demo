package com.test.thread;

public class MyThread extends Thread {

    public MyThread() {
        super();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(this.getName() + " : " + i);
        }
    }
}
