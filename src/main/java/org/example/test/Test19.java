package org.example.test;

public class Test19 {
    public static void main(String[] args) {
        int[] arr = {71, 27, 33, 22, 100, 87, 77, 57};
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                a = a + arr[i];
            }
        }
        System.out.println(a);
    }
}
