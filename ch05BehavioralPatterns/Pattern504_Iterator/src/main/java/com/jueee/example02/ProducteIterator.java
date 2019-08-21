package com.jueee.example02;


import java.util.ArrayList;
import java.util.List;

public class ProducteIterator extends AbstractIterator {
    private List<Object> objectList = new ArrayList<Object>();
    private int cursor1; // 游标
    private int cursor2; // 游标2

    public ProducteIterator(ConcreteObjectList obj) {
        this.objectList = obj.getObjectList();
        cursor1 = 0;
        cursor2 = objectList.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < objectList.size()) {
            cursor1++;
        }
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public Object getPrevious() {
        return objectList.get(cursor2);
    }

    @Override
    public Object getNext() {
        return objectList.get(cursor1);
    }

    @Override
    public boolean isNext() {
        return (cursor1 == objectList.size());
    }

    @Override
    public boolean isFrist() {
        return (cursor2 == -1);
    }

}
