package org.example.test5;

public class Dog extends AnimalParent{
    final int age=20;

    public Dog(){

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookDoor(){
        System.out.println("我在看门");
    }


}
