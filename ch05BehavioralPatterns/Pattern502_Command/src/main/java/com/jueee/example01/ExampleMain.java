package com.jueee.example01;

//测试类
public class ExampleMain {  
  
    public static void main(String[] args) {  
        Receiver receiver = new Receiver();  
        Command cmd = new ConcreteCommand(receiver);  
        Invoker invoker = new Invoker(cmd);  
        invoker.action();  
    }  
}  

