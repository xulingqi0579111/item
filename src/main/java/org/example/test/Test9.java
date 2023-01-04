package org.example.test;

public class Test9 {
    public static void main(String[] args) {
      //珠穆朗玛峰高度为（8844.43米=8844430毫米）纸的厚度数0.1毫米，请问折叠多少次可以叠成珠穆朗玛峰的高度
        int count=0;
        int zhu=8844430;
        double page=0.1;
        while (page<=zhu){
            page=page*2;
            count++;
        }
        System.out.println(count+"折叠次数");
    }
}
