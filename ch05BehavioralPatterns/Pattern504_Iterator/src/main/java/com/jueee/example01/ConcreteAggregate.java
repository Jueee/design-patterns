package com.jueee.example01;

import java.util.ArrayList;
import java.util.List;

// 定义具体的聚合类
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> lists = new ArrayList<T>();

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator(lists);
    }

    @Override
    public void add(T t) {
        lists.add(t);
    }

    @Override
    public void remove(T t) {
        lists.remove(t);
    }
}
