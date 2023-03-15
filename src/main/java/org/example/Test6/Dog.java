package org.example.Test6;

public class Dog extends AnimalParent {
    public int age = 20;
    public int weight = 40;

    @Override
    public void eat() {
        System.out.println("子类（狗类）重写了父类的eat方法");
    }
    public void show(){

    }
}
