package com.jueee.example03;

/** ConcreteComponent具体构件角色（真实对象） */
public class Car implements Icar {

    public void move() {
        System.out.println("Car 在路上跑");
    }
}
