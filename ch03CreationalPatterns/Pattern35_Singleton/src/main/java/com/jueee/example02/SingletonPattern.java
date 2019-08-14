package com.jueee.example02;

public class SingletonPattern {
    
    private static SingletonPattern instance;

    private SingletonPattern(){
        System.out.println("Singleton has loaded");
    }

    public static synchronized SingletonPattern getInstance() {
        if (instance == null) {
            System.out.println("初始化了。。。");
            instance = new SingletonPattern();
        }
        return instance;
    }
}
