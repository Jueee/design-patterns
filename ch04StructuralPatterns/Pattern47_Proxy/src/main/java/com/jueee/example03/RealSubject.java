package com.jueee.example03;

public class RealSubject implements Subject {

    private String name = "Jueee";
    
    public void visit() {
        System.out.println(name);
    }
    
}
