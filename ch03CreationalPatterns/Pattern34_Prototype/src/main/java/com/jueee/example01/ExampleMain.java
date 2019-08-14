package com.jueee.example01;

public class ExampleMain {

    
    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype1();
        Prototype prototype2 = new ConcretePrototype2();
        
        Client client1 = new Client(prototype1);
        Client client2 = new Client(prototype2);
        
        System.out.println(client1);
        System.out.println(client2);
    }
}
