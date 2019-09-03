package com.jueee.example04;

public class ConrecteAllyControlCenter extends AllyControlCenter {

    public ConrecteAllyControlCenter(String name) {
        System.out.println(name + "战队创建成功");
        System.out.println("==================================================");
        this.allyName = name;
    }

    @Override
    public void notifyObserver(String name) {
        // 用来通知集合里所有的观察者，盟友。
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击");
        for (Object obj : players) {
            if (!((Observer)obj).getName().equalsIgnoreCase(name)) {
                ((Observer)obj).help();
            }
        }
    }

}
