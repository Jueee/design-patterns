package com.jueee.example01.item;

import java.util.ArrayList;

import com.jueee.example01.item.Item;

// 零件的抽象类，初始化
public abstract class Tray extends Item {

    protected ArrayList<Item> tray = new ArrayList<Item>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }

}
