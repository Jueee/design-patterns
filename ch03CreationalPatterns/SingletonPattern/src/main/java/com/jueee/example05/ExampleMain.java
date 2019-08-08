package com.jueee.example05;

public class ExampleMain {

    public static void main(String[] args) {
        SingletonPattern pattern1 = SingletonPattern.INSTANCE;
        SingletonPattern pattern2 = SingletonPattern.INSTANCE;
        
        System.out.println(pattern1 == pattern2);
        
        pattern1.otherMethods();
        pattern2.otherMethods();
    }
}
