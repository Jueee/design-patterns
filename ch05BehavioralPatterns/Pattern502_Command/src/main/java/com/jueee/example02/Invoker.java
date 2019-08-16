package com.jueee.example02;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. 创建命令调用类。
 */
public class Invoker {
    private List<Command> orderList = new ArrayList<Command>();

    /**
     * 添加命令
     */
    public void takeOrder(Command order) {
        orderList.add(order);
    }

    /**
     * 执行并清空命令
     */
    public void placeOrders() {
        for (Command order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}