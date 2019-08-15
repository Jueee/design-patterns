package com.jueee.example02;

public class RealSubject implements Subject {

    private String name = "Jueee";
    
    public void visit() {
        System.out.println(name);
    }
    
}
