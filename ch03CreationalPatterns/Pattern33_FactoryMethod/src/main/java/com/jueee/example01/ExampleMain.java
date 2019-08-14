package com.jueee.example01;

public class ExampleMain {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        
        Product productA = factory.create("张三");
        productA.use();
        System.out.println(productA.getOwner());
        
        Product productB = factory.create("李四");
        productB.use();
        System.out.println(productB.getOwner());
        
        System.out.println(factory.getOwners());
    }
}
