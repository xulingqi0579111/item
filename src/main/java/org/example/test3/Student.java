package org.example.test3;

public class Student extends Person {

//    public void show(){
//        System.out.println("子类的方法");
//    }

    public Student(){
        super();
        System.out.println("子类的无参构造方法");
    }

    public Student(int age){
        super(20);
        System.out.println("子类有参构造方法");
    }


}
