package com.jueee.example04;

public class ExampleMain {
    
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20 and up run 30 ";
        InstructionHandler iHandler = new InstructionHandler();
        iHandler.Handle(instruction);
        String outString = iHandler.output();
        System.out.println(outString);
    }
    
}
