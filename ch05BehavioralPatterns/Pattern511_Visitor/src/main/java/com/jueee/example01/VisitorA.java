package com.jueee.example01;

/**
 * 具体访问者角色（Concrete Visitor）：实现每个由访问者角色（Visitor）声明的操作。
 */
public class VisitorA implements Visitor {

    public void visit(PartA A) {
        System.out.println("A 主管" + A.getName());
    }

    public void visit(PartB B) {}

}
