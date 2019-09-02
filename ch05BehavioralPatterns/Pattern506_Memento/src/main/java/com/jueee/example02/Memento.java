package com.jueee.example02;

import java.util.Map;

/**
 * 备忘者角色类
 */
public class Memento {

    private Map<String, String> hashMap;

    public Memento(Map<String, String> map) {
        this.hashMap = map;
    }

    public Map<String, String> getHashMap() {
        return hashMap;
    }

    public void setHashMap(Map<String, String> hashMap) {
        this.hashMap = hashMap;
    }

}