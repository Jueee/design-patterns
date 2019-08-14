package com.jueee.example01;

//测试类
public class ExampleMain {

    public static void main(String[] args) {
        
        Component component = new ConcreteComponent();
        
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();
        
        System.out.println("--------------");
        
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(new ConcreteDecoratorA(component));
        decoratorB.operation();
        
    }
}
