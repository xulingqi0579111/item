package org.example.test;

import java.util.Random;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        System.out.println("请输入一个随机数");
        Scanner sc = new Scanner(System.in);
        int number2 = sc.nextInt();
        Random r = new Random();
        int number1 = r.nextInt(100) + 1;
        System.out.println("随机数为" + number1);
        if (number1 > number2) {
            System.out.println("输入太小了");
        } else if (number1 < number2) {
            System.out.println("输入太大了");
        } else {
            System.out.println("相等");
        }
    }
}
