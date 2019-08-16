package com.jueee.example02;


public class PriceHandlerFactory {

    //创建PriceHandler的工厂函数
    public static PriceHandler createPricHandler() {
        PriceHandler sales= new Sales();
        PriceHandler manager= new Manager();
        PriceHandler ceo= new CEO();
        sales.setSuccessor(manager);
        manager.setSuccessor(ceo);
        return sales;
    }
}


