package com.jueee.example02;

public class BlackBoarderDecorator extends ComponentDecorator{
    
    public BlackBoarderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBoarder();
        super.display();
    }

    public void setBlackBoarder() {
        System.out.println("为构件增加黑色边框！");

    }
}
