package com.jueee.example01;

public class ExampleMain {

    public static void main(String[] args) {
        Aggregate<Object> list = new ConcreteAggregate<Object>();
        list.add("倚天剑");
        list.add("屠龙刀");
        list.add("断肠草");
        list.add("葵花宝典");
        list.add("还我漂漂拳");

        Iterator iterator = list.createIterator();
        System.out.println(iterator.first());
        
        System.out.println("正向遍历");
        System.out.println(iterator.hasNext());
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t\t");
        }
        System.out.println("\n\n");
        System.out.println(iterator.first());
        while (iterator.hasNext()) {
            System.out.print(iterator.currentItem() + "\t\t");
            iterator.next();
            System.out.print(iterator.currentItem() + "\t\t");
        }
    }
}
