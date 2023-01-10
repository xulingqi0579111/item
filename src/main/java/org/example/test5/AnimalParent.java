package org.example.test5;

public class AnimalParent {
    private String name;
    private int age;

    public AnimalParent() {
    }

    public AnimalParent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AnimalParent(String name) {
        this.name = name;
    }

    public AnimalParent(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AnimalParent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
