package com.jueee.example04;

public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("小伙子，" + name + "来救你了，别凉了");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击");
        acc.notifyObserver(name);
    }

}
