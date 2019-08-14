package com.jueee.example01;

//抽象装饰器
public abstract class Decorator implements Component {
    
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}