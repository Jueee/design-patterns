package com.jueee.example01;

public class ConcreteFlyweight implements Flyweight {

    private Character intrinsicState;

    /**
     * 构造函数，内蕴状态作为参数传入
     */
    public ConcreteFlyweight(Character state) {
        this.intrinsicState = state;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为. 但并不改变对象的内蕴状态
     */
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
