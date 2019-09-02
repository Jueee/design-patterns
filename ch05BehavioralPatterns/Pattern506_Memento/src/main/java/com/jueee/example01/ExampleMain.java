package com.jueee.example01;

public class ExampleMain {
    // 场景类
    public static void main(String[] args) {
        // 定义出发起人
        Originator originator = new Originator();
        originator.setState("高兴");
        System.out.println("现在的状态是：" + originator.getState());
        // 定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        originator.setState("伤心");
        System.out.println("现在的状态是：" + originator.getState());
        // 恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("现在的状态是：" + originator.getState());
    }
}
