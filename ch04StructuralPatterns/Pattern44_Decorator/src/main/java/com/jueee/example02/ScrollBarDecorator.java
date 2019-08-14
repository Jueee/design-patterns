package com.jueee.example02;

public class ScrollBarDecorator extends ComponentDecorator{
    
    public ScrollBarDecorator (Component component) {
        super(component); // 调用父类构造函数
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}