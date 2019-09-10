package com.jueee.example02;

public class Mouse implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);        
    }

}
