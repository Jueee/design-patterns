package com.jueee.example01;

import java.util.List;

// 定义具体的迭代器类
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> lists;// 维持一个对具体聚合对象的引用，以便于访问存储在聚合对象中的数据
    private int cursor; // 定义一个游标，用于记录当前访问位置

    public ConcreteIterator(List<T> list) {
        this.lists = list;
    }

    @Override
    public T first() {
        cursor = 0;
        return lists.get(cursor);
    }

    @Override
    public T next() {
        T obj = null;

        if (this.hasNext()) {
            obj = this.lists.get(cursor++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (cursor < lists.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T currentItem() {
        return lists.get(cursor);
    }
}
