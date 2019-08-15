package com.jueee.example01;

public class ProxySubject implements Subject{

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    public void visit() {
        System.out.println("entry ProxySubject.visit");
        subject.visit();
        System.out.println("exit ProxySubject.visit");
    }
}
