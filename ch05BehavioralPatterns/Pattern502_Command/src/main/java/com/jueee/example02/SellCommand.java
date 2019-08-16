package com.jueee.example02;


/**
 * 3. 创建实现了 Order 接口的实体类。
 */
public class SellCommand implements Command{
 
    private Receiver abcStock;
    
    public SellCommand(Receiver abcStock){
        this.abcStock = abcStock;
    }
    
    public void execute() {
        abcStock.sell();
    }
 
}