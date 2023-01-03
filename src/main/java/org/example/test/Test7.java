package org.example.test;

public class Test7 {
    //水仙花和水仙花个数
    public static void main(String[] args) {
        int count=0;
        for (int i = 100; i <=999; i++) {
            int ge=i%10;
            int bai=i/100;
            int shi=i/10%10;
            if ((ge*ge*ge+shi*shi*shi+bai*bai*bai)==i){
                count++;
            }
        }
        System.out.println("水仙花数个数为"+count);
    }
}
