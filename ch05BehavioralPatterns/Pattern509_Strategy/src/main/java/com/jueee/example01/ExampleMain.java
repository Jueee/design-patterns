package com.jueee.example01;

/**
 * 客户端
 */
public class ExampleMain {

    public static void main(String[] args) {
        Context contextA = new Context(new StrategyA(60d));
        System.out.println(contextA.getResult());
        
        Context contextB = new Context(new StrategyB(60d, 0.8d));
        System.out.println(contextB.getResult());
        
        Context contextC = new Context(new StrategyC(60d, 10d));
        System.out.println(contextC.getResult());
    }
}
