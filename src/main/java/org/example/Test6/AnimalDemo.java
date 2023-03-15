package org.example.Test6;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalParent animalParent = new Dog();
        System.out.println(animalParent.age);
        animalParent.eat();

    }
}
