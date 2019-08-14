package com.jueee.example03;

/** 具体的装饰类 */
public class FlyCar extends SuperCar {

    public FlyCar(Icar icar) {
        super(icar);
    }

    public void fly() {
        System.out.println("car 能在天上飞了");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
