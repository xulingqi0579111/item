package org.example.test;

public class Test14 {
    public static void main(String[] args) {
        int c = max(10, 20);
        System.out.println(c);
    }

    public static int max(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

}
