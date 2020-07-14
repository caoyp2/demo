package com.test.refelect;

public class RefelectDemo1 {
    /*
        反射获取Class对象的三种方式
     */
    public static void main(String[] args) {
        try {
            Class cla = Class.forName("com.test.refelect.Student");
            Student student = (Student) cla.newInstance();
            student.setName("小明");
            System.out.println(student);

            //方式二
            Class cla2 = Student.class;
            Student student2 = (Student) cla2.newInstance();
            student2.setName("王五");
            System.out.println(student2);
            //方式三
            Student student3 = new Student();
            student3.setName("张三");
            Class cla3 = student3.getClass();
            System.out.println(student3);


            System.out.println(student == student2);
            System.out.println(student == student3);
            System.out.println(cla == cla2);
            System.out.println(cla == cla3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

}
