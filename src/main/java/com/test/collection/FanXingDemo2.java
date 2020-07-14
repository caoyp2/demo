package com.test.collection;

public class FanXingDemo2 implements GenericInterface<String> {


    @Override
    public void add(String o) {
        System.out.println(o);
    }

    @Override
    public String  getE(String o) {
        return o;
    }

    public static void main(String[] args) {
        FanXingDemo2 fanXingDemo2 = new FanXingDemo2();
        fanXingDemo2.add("aaaa");
        fanXingDemo2.getE("bbbb");
    }
}
