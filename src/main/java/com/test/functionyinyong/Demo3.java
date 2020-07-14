package com.test.functionyinyong;

/**
 * 类的构造器引用
 */
public class Demo3 {

    public static  Person  buildPerson(String name,PersonBuilder personBuilder){
        return personBuilder.build(name);
    }

    public static void main(String[] args) {
        String namestr = "迪丽热巴";
        System.out.println(buildPerson(namestr, name -> new Person(name)));

        /*
        使用方法引用
         */
        System.out.println(buildPerson(namestr,Person::new));
    }
}
