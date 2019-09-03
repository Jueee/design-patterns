package com.jueee.example03;

/**
 * 观察者模式(Observer) 看股票的同事
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + name + " 关闭股票行情，继续工作！");
    }

}
