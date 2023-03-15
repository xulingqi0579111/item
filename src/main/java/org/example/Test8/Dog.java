package org.example.Test8;

public class Dog extends AnimalParent{
    public Dog(int age) {
        super(age);
        System.out.println("我是狗类中的有参构造方法");
    }

    @Override
    public void eat() {
        System.out.println("我是狗类  我喜欢吃骨头");
    }

    @Override
    public void show() {
        System.out.println("子类的show方法");
    }
}
