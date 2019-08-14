package com.jueee.example02;

public class ExampleMain {
    
    public static void main(String[] args) {
        try {
            Prototype p1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("p1", p1);
            System.out.println("第1个实例：" + p1);
            // 获取原型来创建对象
            Prototype p2 = PrototypeManager.getPrototype("p1").clone();
            p2.setName("张三");
            System.out.println("第3个实例：" + p2);
            // 有人动态的切换了实现
            Prototype p3 = new ConcretePrototype2();
            PrototypeManager.setPrototype("p1", p3);
            System.out.println("第3个实例：" + p3);
            // 重新获取原型来创建对象
            Prototype p4 = PrototypeManager.getPrototype("p1").clone();
            p4.setName("李四");
            System.out.println("第4个实例：" + p4);
            // 有人注销了这个原型
            PrototypeManager.removePrototype("p1");
            // 再次获取原型来创建对象
            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第5个实例：" + p5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
