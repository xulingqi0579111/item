package org.example.test5;

public class AnimalDemo02 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("小猫A");
        cat1.setAge(2);
        Cat cat2 = new Cat();
        cat2.setName("小猫B");
        cat2.setAge(2);
        System.out.println(cat1.getName()+","+cat1.getAge());
        System.out.println(cat2.getName()+","+cat2.getAge());
        System.out.println("------------------------------");

        Dog dog1 = new Dog();
        dog1.setName("小黄狗");
        dog1.setAge(2);
        Dog dog2 = new Dog();
        dog2.setName("小白狗");
        dog2.setAge(1);

        System.out.println(dog1.getName()+","+dog1.getAge());
        System.out.println(dog2.getName()+","+dog2.getAge());
    }
}
