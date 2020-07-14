package com.test.functionyinyong;

public class Demo2 {

    public static void printSomething(Printable printable){
        printable.print("Hello world");
    }

    public static void main(String[] args) {

        /*
            使用lambda方式调用
         */
        printSomething(str -> {
            MethodRerObject methodRerObject = new MethodRerObject();
            methodRerObject.printUpper(str);
        });

        /*
            通过对象名引用成员方法
            使用前提是对象名是已经存在的，成员方法也是已经存在
            就可以使用对象名来引用成员方法
         */
        //使用方法引用
        MethodRerObject obj = new MethodRerObject();
        printSomething(obj :: printUpper);


        //方法引用静态方法
        printSomething(MethodRerObject :: printLower);
    }
}
