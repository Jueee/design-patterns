package com.jueee.example01;

/**
 * 元素角色（Element）：定义一个Accept 操作，它以一个访问者为参数。
 */
public interface Element {

    /**
     * 允许谁来访问
     * @param visitor
     */
    public void accept(Visitor visitor);

}
