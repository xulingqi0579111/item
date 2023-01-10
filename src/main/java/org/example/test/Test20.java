package org.example.test;

public class Test20 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 66, 88, 99};
        int[] arr2 = {11, 22, 66, 88, 99};
        boolean compare = compare(arr1, arr2);
        System.out.println(compare);
    }

    public static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
