package org.example.test;

public class Test1 {
    public static void main(String[] args) {
        //三元运算符
        int height1=150;
        int height2=210;
        int height3=165;
        int tempHeight=height1>height2?height1:height2;
        int maxHeignt=tempHeight>height3?tempHeight:height3;
        System.out.println(maxHeignt );
    }
}
