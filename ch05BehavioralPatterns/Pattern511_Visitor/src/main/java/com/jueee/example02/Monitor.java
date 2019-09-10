package com.jueee.example02;

public class Monitor implements ComputerPart{

    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);        
    }

}
