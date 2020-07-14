package com.test.thread;

public class SynchronizedDemo  implements  Runnable{
    private int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "正在售票：" + ticket --);
                }
            }
        }
    }
}
