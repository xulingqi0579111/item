package org.example.test3;

public class Person {
    protected int age=18;

    public Person() {
        System.out.println("父类的无参构造方法");
    }


    public Person(int age) {
        System.out.println("父类的有参构造方法");
        this.age = age;
    }

    public void show(){
        System.out.println("父类的方法");
    }
}
