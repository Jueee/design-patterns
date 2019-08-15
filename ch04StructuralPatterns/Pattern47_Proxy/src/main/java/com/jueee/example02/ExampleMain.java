package com.jueee.example02;

import java.lang.reflect.Proxy;

public class ExampleMain {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxy = new ProxySubject(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        Subject subject = (Subject)Proxy.newProxyInstance(classLoader, new Class[] {Subject.class}, proxy);
        subject.visit();
    }
}
