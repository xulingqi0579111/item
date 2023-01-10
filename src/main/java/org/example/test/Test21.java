package org.example.test;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        System.out.println("随机输入一个数字");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = {29, 68, 33, 44, 10};
        int index = findIndex(a, arr);
        System.out.println(index == -1 ? "没找到" : "找到了");
        System.out.println(index);
    }

    public static int findIndex(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
