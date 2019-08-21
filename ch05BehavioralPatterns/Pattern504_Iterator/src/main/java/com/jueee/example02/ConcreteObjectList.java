package com.jueee.example02;

import java.util.List;

public class ConcreteObjectList extends AbstractObjectList {

    public ConcreteObjectList(List<Object> list) {
        super(list);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProducteIterator(this);
    }

}
