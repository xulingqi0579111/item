package org.example.test;

public class Test23 {
    public static void main(String[] args) {
        int[] arr = {33, 66, 22, 11, 55};
        int[] temp=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[arr.length-1-i];
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
            if (i<temp.length-1){
                System.out.print(",");
            }
        }
    }
}
