package com.jueee.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构角色（Object Structure）：这是使用访问者模式必备的角色。它要具备以下特征：能枚举它的元素；<br>
 * 可以提供一个高层的接口以允许该访问者访问它的元素；可以是 一个复合（组合模式）或是一个集合，如一个列表或一个无序集合。
 */
public class ObjectStructure {

    public List<Element> elements = new ArrayList<Element>();

    public void addVisitor(Element element) {
        elements.add(element);
    }

    public void removeVisitor(Element element) {
        elements.remove(element);
    }

    public void accapt(Visitor visitor) {
        for (Element element : elements)
            element.accept(visitor);
    }

}
