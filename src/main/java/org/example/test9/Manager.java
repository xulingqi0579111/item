package org.example.test9;

public class Manager extends Employee{
    private double bonus;
    public Manager() {
        System.out.println("Manager的无参构造方法");
    }


    public Manager(String name, int number, double salary, double bonus) {
        super(name, number, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Manager的干活方法");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
