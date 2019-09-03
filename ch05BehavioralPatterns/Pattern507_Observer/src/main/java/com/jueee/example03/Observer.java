package com.jueee.example03;

/**
 * 观察者模式(Observer) 抽象观察者
 */
public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();

}
