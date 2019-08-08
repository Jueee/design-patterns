package com.jueee.example08;

public class SingletonPattern {

    private static final ThreadLocal<SingletonPattern> threadSingleton = 
        new ThreadLocal<SingletonPattern>() {
            protected SingletonPattern initialValue() {
                return new SingletonPattern();
            };
        };

    private SingletonPattern() {
        System.out.println("Singleton has loaded");
    }

    public static SingletonPattern getInstance() {
        return threadSingleton.get();
    }
}
