package com.jueee.example01;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {

    //存储订阅公众号的微信用户
    private List<Observer> weixinUserList = new ArrayList<>();


    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserList) {
            observer.update(message);
        }
    }
}
