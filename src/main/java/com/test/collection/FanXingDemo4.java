package com.test.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型的上限和下限
 */
public class FanXingDemo4 {

    public static void main(String[] args) {
        Collection<Number> coll = new ArrayList<>();
        Collection<Integer> coll1 = new ArrayList<>();
        Collection<String> coll2 = new ArrayList<>();
        Collection<Object> coll3 = new ArrayList<>();
        getEle1(coll);
        getEle1(coll1);
        //getEle1(coll2); //会报错

        getEle2(coll);
        getEle2(coll3);
        //getEle2(coll2); //会报错
    }
    /**
     * Collection<? super Number>
     *  只能接受number及其子类的类型
     * @param collection
     */
    public static void getEle1(Collection<? extends  Number> collection){
        for(Number number : collection){
            System.out.println(number);
        }
    }

    /**
     * Collection<? super Number>
     *  只能接受number及其父级的类型
     * @param collection
     */
    public static void getEle2(Collection<? super Number> collection){
        for(Object object : collection){
            System.out.println(object);
        }
    }
}
