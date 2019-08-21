package com.jueee.example02;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
    // 创建一个object 的arraylist集合
    protected List<Object> objectList = new ArrayList<Object>();

    public AbstractObjectList(List<Object> list) {
        // TODO Auto-generated constructor stub
        this.objectList = list;
    }

    // 添加方法。
    public void AddObject(Object o) {
        this.objectList.add(o);
    }

    // 删除方法。
    public void RemoveObject(Object o) {
        this.objectList.remove(o);
    }

    // 获取到list
    public List<Object> getObjectList() {
        return objectList;
    }

    // 获取arrayList
    // 获取迭代器的工厂方法
    public abstract AbstractIterator createIterator();

}
