package com.jueee.example01;

import java.util.ArrayList;
import java.util.List;

public class ExampleMain {

    public static void main(String[] args) {
        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyweightFactory.factory(compositeState);
        Flyweight compositeFly2 = flyweightFactory.factory(compositeState);
        compositeFly1.operation("Composite Call");

        System.out.println("-----------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        Character state = 'a';
        Flyweight fly1 = flyweightFactory.factory(state);
        Flyweight fly2 = flyweightFactory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }

}

