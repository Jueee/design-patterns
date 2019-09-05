package com.jueee.example03;

/**
 * 客户端
 */
public class ExampleMain {

    public static void main(String[] args) {
        Context contextA = new Context(StrategyTypeEnum.原价, 60d, null, null);
        System.out.println(contextA.getResult());

        Context contextB = new Context(StrategyTypeEnum.折扣, 60d, null, 0.8d);
        System.out.println(contextB.getResult());

        Context contextC = new Context(StrategyTypeEnum.满减, 60d, 10d, null);
        System.out.println(contextC.getResult());
    }
}
