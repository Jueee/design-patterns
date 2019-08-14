package com.jueee.example02;

//测试类
public class ExampleMain {

    public static void main(String[] args) {
        
        Component component = new Window();
        
        Component componentSB = new ScrollBarDecorator(component);
        componentSB.display();
        
        System.out.println("--------------------");
        
        Component componentBB = new BlackBoarderDecorator(componentSB);
        componentBB.display();
        
    }
}
