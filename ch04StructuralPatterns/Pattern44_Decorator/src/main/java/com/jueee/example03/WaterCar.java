package com.jueee.example03;

/** 具体的装饰类 */
public class WaterCar extends SuperCar {

    public WaterCar(Icar icar) {
        super(icar);
    }

    public void water() {
        System.out.println("Car 能在水里游了");
    }

    @Override
    public void move() {
        super.move();
        water();
    }
}
