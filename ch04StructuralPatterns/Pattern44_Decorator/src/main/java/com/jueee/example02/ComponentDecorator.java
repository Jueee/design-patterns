package com.jueee.example02;

public class ComponentDecorator extends Component{
    
    private Component component; // 维持对抽象构件类型对象的引用
    
    public ComponentDecorator(Component component){
        this.component = component;
    }

    public void display() {
        component.display();
    }

}
