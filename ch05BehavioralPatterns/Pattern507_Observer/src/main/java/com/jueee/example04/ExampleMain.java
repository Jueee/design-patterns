package com.jueee.example04;

public class ExampleMain {
    
    public static void main(String[] args) {
        // 定义观察目标
        AllyControlCenter acc = new ConrecteAllyControlCenter("神奇四侠");
        // 定义观察者
        Observer p1, p2, p3, p4;
        p1 = new Player("杨过");
        p2 = new Player("帅哥威");
        p3 = new Player("小倩倩");
        p4 = new Player("小木");
        acc.add(p1);
        acc.add(p2);
        acc.add(p3);
        acc.add(p4);
        // 一个成员受到攻击
        p2.beAttacked(acc);
    }
    
}
