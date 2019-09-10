package com.jueee.example02;

public class Keyboard implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);        
    }

}
