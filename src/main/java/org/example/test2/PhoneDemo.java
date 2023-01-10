package org.example.test2;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.brand="小米";
        phone.price=2999;
        System.out.println(phone.toString());

        phone.call(phone.brand);
    }
}
