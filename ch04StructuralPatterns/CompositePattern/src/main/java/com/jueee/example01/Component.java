package com.jueee.example01;

public abstract class Component {
    
    
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     *  打印
     *	@param preStr 前缀，主要是按照层级拼接的空格，实现向后缩进
     */
    public abstract void printStruct(String preStr);
    
}
