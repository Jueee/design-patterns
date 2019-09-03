package com.jueee.example02;

public class ExampleMain {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        concreteSubject.attach(new ConcreteObserver(concreteSubject, "X"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "Y"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "Z"));

        concreteSubject.setSubjectState("ABC");
        concreteSubject.notifyObserver();
    }
}
