package com.jueee.example01;

//具体的抽象构件的实现
public class ConcreteComponent implements Component {

    public void operation() {
        System.out.println("我是ConcreteComponent，是最原始的实现类，我处于最底层");
    }

}
