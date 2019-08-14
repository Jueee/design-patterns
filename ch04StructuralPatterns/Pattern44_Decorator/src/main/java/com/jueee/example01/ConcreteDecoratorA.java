package com.jueee.example01;

//具体装饰器A
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void methodA() {
        System.out.println("我是ConcreteDecoratorA，添加的新功能");
    }

    @Override
    public void operation() {
        methodA();
        super.operation();
        System.out.println("ConcreteDecoratorA的operation执行完毕");
    }

}
