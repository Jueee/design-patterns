package com.jueee.example02;

import java.util.ArrayList;
import java.util.List;

public class ExampleMain {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<Object>();
        AbstractObjectList list = new ConcreteObjectList(list1);
        list.AddObject("倚天剑");
        list.AddObject("屠龙刀");
        list.AddObject("断肠草");
        list.AddObject("葵花宝典");
        list.AddObject("还我漂漂拳");

        AbstractIterator iterator = list.createIterator();
        System.out.println("正向遍历");

        while (!iterator.isNext()) {
            System.out.print(iterator.getNext() + "\t\t");
            iterator.next();
        }
        System.out.println("\n\n");
        // 反向遍历
        System.out.println("反向遍历");
        while (!iterator.isFrist()) {
            System.out.print(iterator.getPrevious() + "\t\t");
            iterator.previous();
        }
    }
}
