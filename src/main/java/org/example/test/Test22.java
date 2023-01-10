package org.example.test;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + i + "数字");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            arr[i] = a;
            System.out.println("第" + i + "的值为" + arr[i]);
        }
        int max = getMax(arr);
        System.out.println("最大第值" + max);
        int min = getMin(arr);
        System.out.println("最小第值" + min);
        int sum = getSum(arr);
        System.out.println("所有值的和为" + sum);
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println("平均分为"+avg);

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
