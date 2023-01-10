package org.example.test5;

public class Cat extends AnimalParent{
    public Cat(){

    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void CatchMouse(){
        System.out.println("抓老鼠");
    }
}
