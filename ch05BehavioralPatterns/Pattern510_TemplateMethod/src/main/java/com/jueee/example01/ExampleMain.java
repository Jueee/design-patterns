package com.jueee.example01;

public class ExampleMain {
    
    public static void main(String[] args) {
        AbstractClass contrete = new ContreteTemplateA();
        contrete.print();

        System.out.println();
        
        contrete = new ContreteTemplateB();
        contrete.print();
    }

}
