package com.jueee.example02;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    public <T> void visit(T t) {
        System.out.println(t.getClass().getName());
    }

}
