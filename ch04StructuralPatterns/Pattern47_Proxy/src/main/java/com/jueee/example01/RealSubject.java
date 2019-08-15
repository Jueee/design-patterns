package com.jueee.example01;

public class RealSubject implements Subject {

    private String name = "Jueee";
    
    public void visit() {
        System.out.println(name);
    }
    
}
