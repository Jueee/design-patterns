package com.jueee.example03;

/**
 * 观察者模式(Observer)
 * 通知者接口
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notice();

    String getAction();

    void setAction(String action);

}
