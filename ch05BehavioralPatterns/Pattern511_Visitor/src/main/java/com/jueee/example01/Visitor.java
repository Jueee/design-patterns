package com.jueee.example01;

/**
 * 访问者角色（Visitor）：为该对象结构中具体元素角色声明一个访问操作接口。该操作接口的名字和参数标识了发送访问请求给具体访问者的具体元素角色。 这样访问者就可以通过该元素角色的特定接口直接访问它。
 */
public interface Visitor {

    /**
     * 定义可以访问的对象
     * @param A
     */
    public void visit(PartA A);

    /**
     * 两个元素，就定义两个访问对象
     * @param B
     */
    public void visit(PartB B);

}
