package org.example.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数值类型的数据");
        int a=sc.nextInt();
        System.out.println("您数值类型的值为："+a);
        System.out.println("请再输入一个数值类型的数据");
        int b=sc.nextInt();
        System.out.println("您数值类型的值为："+b);
        int sum=a+b;
        System.out.println("两个值的和是"+sum);
    }
}
