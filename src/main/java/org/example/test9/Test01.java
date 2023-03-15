package org.example.test9;

public class Test01 {
    public static void main(String[] args) {
        Employee employee=new Manager("张三",18,20.34,2000.00);
       Manager manager= (Manager) employee;
        employee.work();
        System.out.println(employee.getName());
        System.out.println(employee.getNumber());
        System.out.println(employee.getSalary());
        System.out.println(manager.getBonus());
    }
}
