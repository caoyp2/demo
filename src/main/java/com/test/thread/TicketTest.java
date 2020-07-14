package com.test.thread;

public class TicketTest {
    public static void main(String[] args) {

//        Ticket t1 = new Ticket();
//
//        Thread thread1 = new Thread(t1,"窗口1");
//        Thread thread2 = new Thread(t1,"窗口2");
//        Thread thread3 = new Thread(t1,"窗口3");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();


        //加了锁之后
//        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
//        Thread thread1 = new Thread(synchronizedDemo,"窗口1");
//        Thread thread2 = new Thread(synchronizedDemo,"窗口2");
//        Thread thread3 = new Thread(synchronizedDemo,"窗口3");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();

        //使用Lock加锁
        LockDemo lockDemo = new LockDemo();
        Thread thread1 = new Thread(lockDemo,"窗口1");
        Thread thread2 = new Thread(lockDemo,"窗口2");
        Thread thread3 = new Thread(lockDemo,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
