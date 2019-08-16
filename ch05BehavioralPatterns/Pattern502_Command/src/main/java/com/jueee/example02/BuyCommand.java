package com.jueee.example02;

/**
 * 3. 创建实现了 Order 接口的实体类。
 */
public class BuyCommand implements Command{
 
    private Receiver abcStock;
    
    public BuyCommand(Receiver abcStock){
        this.abcStock = abcStock;
    }
    
    public void execute() {
        abcStock.buy();
    }
 
}