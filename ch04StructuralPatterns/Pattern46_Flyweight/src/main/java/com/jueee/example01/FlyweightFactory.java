package com.jueee.example01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {

    private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

    /**
     * 复合享元工厂方法
     */
    public Flyweight factory(List<Character> compositeState) {
        UnsharedConcreteFlyweight compositeFly = new UnsharedConcreteFlyweight();

        for (Character state : compositeState) {
            compositeFly.add(state, this.factory(state));
        }

        return compositeFly;
    }

    /**
     * 单纯享元工厂方法
     */
    public Flyweight factory(Character state) {
        // 先从缓存中查找对象
        Flyweight fly = files.get(state);
        if (fly == null) {
            // 如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            // 把这个新的Flyweight对象添加到缓存中
            files.put(state, fly);
        }
        return fly;
    }
}

