package com.jueee.example01;

/**
 * 具体元素角色（Concrete Element）：实现由元素角色提供的Accept 操作。
 */
public class PartB implements Element {

    String s = "PartB";

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return s;
    }

}
