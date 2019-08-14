package com.jueee.example01;

public class SingletonPattern {
    
    private static SingletonPattern instance;

    private SingletonPattern(){
        System.out.println("Singleton has loaded");
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            System.out.println("初始化了。。。");
            instance = new SingletonPattern();
        }
        return instance;
    }
}
