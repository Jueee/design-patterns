package com.jueee.example03;

/** Docorator装饰角色 */
public class SuperCar implements Icar {

    protected Icar icar;

    public SuperCar(Icar icar) {
        this.icar = icar;
    }

    public void move() {
        icar.move();
    }
}
