package com.jueee.example01;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    /**
     * 示意方法，执行某些操作
     */
    public void operation() {
        // 在需要跟其他同事通信的时候，通知调停者对象
        System.out.println("ConcreteColleagueA operation");
        getMediator().changed(this);
    }
    
    public void print() {
        System.out.println("ConcreteColleagueA print.");
    }
}
