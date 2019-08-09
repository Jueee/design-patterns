package com.jueee.example01;

public class ExampleMain {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.sampleOperation1();
        target.sampleOperation2();
    }
}
