package com.jueee.example02;

import java.util.HashMap;

/**
 * 备忘录管理类
 */
public class MementoManager {

    private HashMap<String, Memento> meMap = new HashMap<String, Memento>();

    public Memento getMemento(String id) {
        return this.meMap.get(id);
    }

    public void setMemento(String id, Memento me) {
        this.meMap.put(id, me);
    }
}
