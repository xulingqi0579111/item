package org.example.test2;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.toString());
        Student s2 = new Student("张三");
        System.out.println(s2.toString());
        Student s3 = new Student(18);
         System.out.println(s3.toString());
        Student s4 = new Student("张四", 29);
        System.out.println(s4.toString());
    }
}
