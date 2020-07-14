package com.test.collection;

public class FanXingDemo3<E> implements GenericInterface<E> {
    @Override
    public void add(E o) {
        System.out.println(o);
    }

    @Override
    public E getE(E e) {
        return null;
    }

    public static void main(String[] args) {
        FanXingDemo3<Integer> fanXingDemo3 = new FanXingDemo3<>();
        fanXingDemo3.add(123);
    }
}
