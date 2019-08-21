package com.jueee.example02;


public abstract class AbstractIterator {
    // 抽象迭代器类
    // 移到下一个元素
    public abstract void next();

    // 移到上一个元素
    public abstract void previous();

    // 获取上一个元素返回object
    public abstract Object getPrevious();

    // 获取下一个元素放回OBJECT
    public abstract Object getNext();

    // 是否是第一个元素boolean
    public abstract boolean isNext();

    // 是否是最后一个元素
    public abstract boolean isFrist();

}
