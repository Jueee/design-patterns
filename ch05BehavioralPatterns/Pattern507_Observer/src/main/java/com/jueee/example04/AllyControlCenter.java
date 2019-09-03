package com.jueee.example04;

import java.util.ArrayList;

public abstract class AllyControlCenter {
    protected String allyName; // 战队名称
    protected ArrayList<Observer> players = new ArrayList<Observer>(); // 定义一个观察者的集合

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    // 添加一个观察者
    public void add(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队");
        players.add(obs);
    }

    // 删除一个观察者
    public void delete(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队");
        players.remove(obs);
    }

    // 提醒更新
    public abstract void notifyObserver(String name);

}
