package com.jueee.example04;

public class SingletonPattern {
    
    private static class SingletonHolder {
        private static SingletonPattern instance = new SingletonPattern();
    }
    
    private SingletonPattern(){
        System.out.println("Singleton has loaded.");
    }

    public static SingletonPattern getInstance() {
        return SingletonHolder.instance;
    }
}
