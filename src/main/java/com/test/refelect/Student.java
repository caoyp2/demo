package com.test.refelect;

public class Student {
    private String name;
    private int age;
    public String gender;

    Student(){

    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String eat(String food){
        System.out.println("eat...." + food);
        return food;
    }

    public void eat(){
        System.out.println("eat....");
    }
}
