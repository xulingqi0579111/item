package org.example.test9;

public abstract class Employee {
    private String name;
    private int number;
    private double salary;
    public abstract void work();

    public Employee() {
    }

    public Employee(String name, int number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
