package com.jueee.example02;

/**
 * 2. 创建一个请求类。
 */
public class Receiver {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", " + "Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", " + "Quantity: " + quantity + " ] sold");
    }

}
