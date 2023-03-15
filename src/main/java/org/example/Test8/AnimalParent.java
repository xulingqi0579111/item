package org.example.Test8;

public abstract class AnimalParent {
    private int age;
    private final int code=200;

    public AnimalParent(int age) {
        this.age = age;
        System.out.println("AnimalParent   我是有参的构造方法");
    }

    public AnimalParent()    {
        System.out.println("AnimalParent   我是无参的构造方法");
    }

    public abstract void eat();

    public void show(){
        System.out.println(age);
        System.out.println(code );
    }
}
