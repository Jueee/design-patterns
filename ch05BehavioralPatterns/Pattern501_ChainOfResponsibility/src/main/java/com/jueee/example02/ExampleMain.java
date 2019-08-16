package com.jueee.example02;

import java.util.Random;

public class ExampleMain {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPricHandler());
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":");
            float value = (float)(rand.nextFloat()*0.7);
            customer.requestDiscount(value);
        }
    }
}
