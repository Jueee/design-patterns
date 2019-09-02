package com.jueee.example02;

public class ExampleMain {

    public static void main(String[] args) {

        // 定义发起人
        Originator originator = new Originator();
        // 设置发起人的状态
        originator.setProvince("江苏省");
        originator.setCity("常州市");
        originator.setPostCode("213000");
        System.out.println("-------原始状态------");
        System.out.println(originator.toString());

        // 定义备忘录管理类
        MementoManager mm = new MementoManager();
        // 创建一个发起人备份
        Memento memento = originator.createMemento();
        // 将备份数据保存到备忘录管理对象中
        mm.setMemento("001", memento);
        mm.setMemento("002", memento);

        // 修改状态
        originator.setProvince("浙江省");
        originator.setCity("杭州市");
        originator.setPostCode("333000");
        System.out.println("-------修改后的状态------");
        System.out.println(originator.toString());

        // 从备份回复原始状态
        originator.backFromMemento(mm.getMemento("001"));
        System.out.println("-------恢复后的状态------");
        System.out.println(originator.toString());
    }
}
