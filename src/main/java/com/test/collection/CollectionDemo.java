package com.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String[] args) {

        //
        Collection<String> coll = new ArrayList<String>();
        coll.add("one");
        coll.add("two");
        coll.add("three");
        coll.remove("one");
        System.out.println(coll.isEmpty());

        /**
         * 迭代器原理
         * 采用内部指针来跟踪集合中的元素，hasNext()true时，调用next()将指针后移动一位且返回该位置的元素
         * hasNext()false时，表示到达集合末尾
         */
        Iterator<String> iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //增强for循环
        for(String str : coll){
            System.out.println(str);
        }
    }
}
