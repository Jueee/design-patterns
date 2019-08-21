package com.jueee.example01;

// 定义抽象迭代器
public interface Iterator<T> {
    
    T first(); // 将游标指向第一个元素

    T next(); // 将游标指向下一个元素

    boolean hasNext(); // 判断是否存在下一个元素

    T currentItem(); // 获取游标指向的当前元素
}
