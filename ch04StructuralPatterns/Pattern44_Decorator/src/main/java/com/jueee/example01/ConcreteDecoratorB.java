package com.jueee.example01;

//具体装饰器B
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void methodB() {
        System.out.println("我是ConcreteDecoratorB，添加的新功能");
    }

    @Override
    public void operation() {
        methodB();
        super.operation();
        System.out.println("ConcreteDecoratorB的operation执行完毕");
    }

}
