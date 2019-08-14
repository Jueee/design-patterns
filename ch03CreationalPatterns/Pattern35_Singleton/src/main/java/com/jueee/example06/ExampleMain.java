package com.jueee.example06;

public class ExampleMain {

    public static void main(String[] args) {
        SingletonPattern pattern1 = SingletonPattern.getInstance();
        SingletonPattern pattern2 = SingletonPattern.getInstance();
        
        System.out.println(pattern1 == pattern2);
    }
}
