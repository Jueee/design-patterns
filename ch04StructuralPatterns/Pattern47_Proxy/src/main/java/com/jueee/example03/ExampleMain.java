package com.jueee.example03;

public class ExampleMain {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = (Subject)new ProxySubject(realSubject).getProxyInstance();
        subject.visit();
    }
}
