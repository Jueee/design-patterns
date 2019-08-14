package com.jueee.example02;

public class ExampleMain {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
