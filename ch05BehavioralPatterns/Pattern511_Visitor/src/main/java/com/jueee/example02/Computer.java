package com.jueee.example02;

public class Computer implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);        
    }
}
