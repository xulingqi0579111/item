package org.example.test7;

public class AnimalOperate {
    public void userCat(Cat cat) {
        cat.eat();
    }

    public void userDog(Dog dog) {
        dog.eat();
    }

    public void userAnimal() {
        AnimalParent cat = new Cat();
        cat.eat();
        AnimalParent dog = new Dog();
        dog.eat();
    }

    public void userAnimal(AnimalParent animalParent) {
//        animalParent=new Dog();
        animalParent.eat();
    }
}
