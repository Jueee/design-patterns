package com.jueee.example01;

// 定义抽象聚合类
public interface Aggregate<T> {
    
    void add(T t);

    void remove(T t);

    Iterator<T> createIterator();
}
