package com.jueee.example01;

public class Facade {

    private SubSystemA obj1 = new SubSystemA();
    private SubSystemB obj2 = new SubSystemB();
    private SubSystemC obj3 = new SubSystemC();

    public void Method() {
        obj1.MethodA();
        obj2.MethodB();
        obj3.MethodC();
    }
}