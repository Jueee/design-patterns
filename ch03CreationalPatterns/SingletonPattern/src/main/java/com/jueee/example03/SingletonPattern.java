package com.jueee.example03;

public class SingletonPattern {
    
    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern(){}

    public static SingletonPattern getInstance() {
        return instance;
    }
}
