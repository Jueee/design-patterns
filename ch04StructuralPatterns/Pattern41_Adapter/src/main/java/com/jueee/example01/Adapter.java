package com.jueee.example01;

public class Adapter extends Adaptee implements Target {
    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    public void sampleOperation2() {
        System.out.println("Adapter sampleOperation2");
    }

}
