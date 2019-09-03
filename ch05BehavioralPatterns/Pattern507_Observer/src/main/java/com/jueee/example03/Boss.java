package com.jueee.example03;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式(Observer)
 * 老板类
 */
public class Boss implements Subject {

    // 同事列表
    private List<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice() {
        for (Observer o : observers) {
            o.update();
        }
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public void setAction(String action) {
        this.action = action;
    }

}
