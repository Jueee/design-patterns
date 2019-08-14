package com.jueee.example01;

public class RefinedAbstraction extends Abstraction {
    // 覆写构造函数
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }

    // 修正父类的行为
    @Override
    public void request() {
        System.out.println("RefinedAbstraction request");
        super.request();
        super.getImp().doAnything();
    }

}
