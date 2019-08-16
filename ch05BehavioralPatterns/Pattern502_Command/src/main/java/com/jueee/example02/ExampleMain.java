package com.jueee.example02;

// 测试类
public class ExampleMain {

    public static void main(String[] args) {
        Receiver abcStock = new Receiver();

        BuyCommand buyStockOrder = new BuyCommand(abcStock);
        SellCommand sellStockOrder = new SellCommand(abcStock);

        Invoker broker = new Invoker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
