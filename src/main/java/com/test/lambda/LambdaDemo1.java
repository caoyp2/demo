package com.test.lambda;

public class LambdaDemo1 {

    public static void main(String[] args) {
        //创建线程1
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是线程1");
            }
        },"线程1").start();

        //lambda方式创建线程2
        new Thread(()-> {
            System.out.println("这是线程2");
        },"线程2").start();


        //使用lambda方式调用invkoeTest得传参
        String aa="hello lambda";
        invkoeTest((String a) -> System.out.println(a),aa);

        //有返回值时的lambda使用方式
        invkoeTest1((int a,int b) -> { return a+b;},10,20);

    }

    public static  void invkoeTest(Person person,String a){
        person.test(a);
    }

    public static void invkoeTest1(Animal animal,int a,int b){
        int add = animal.speed(a,b);
        System.out.println("速度为：" + add);
    }

}
