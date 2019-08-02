package com.jueee.example01;

public class SingletonPattern {
    
    private static SingletonPattern instance;

    private SingletonPattern(){}

    public static SingletonPattern getInstance() {
        if (instance == null) {
            System.out.println("初始化了。。。");
            instance = new SingletonPattern();
        }
        return instance;
    }
}
