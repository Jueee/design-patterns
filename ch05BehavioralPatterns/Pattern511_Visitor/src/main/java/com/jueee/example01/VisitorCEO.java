package com.jueee.example01;

/**
 * 具体访问者角色（Concrete Visitor）：实现每个由访问者角色（Visitor）声明的操作。
 */
public class VisitorCEO implements Visitor {

    public void visit(PartA A) {
        System.out.println("CEO主管" + A.getName());
    }

    public void visit(PartB B) {
        System.out.println("CEO主管" + B.getName());
    }

}
