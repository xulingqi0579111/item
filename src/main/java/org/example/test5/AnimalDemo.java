package org.example.test5;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("小猫A", 3);
        Cat cat2 = new Cat("小猫B", 3);
        System.out.println(cat1.getName()+","+cat1.getAge());
        System.out.println(cat2.getName()+","+cat2.getAge());
        System.out.println("------------------------------");
        Dog dog1=new Dog("小黄狗",2);
        Dog dog2=new Dog("小白狗",1);

        System.out.println(dog1.getName()+","+dog1.getAge());
        System.out.println(dog2.getName()+","+dog2.getAge());


    }
}
