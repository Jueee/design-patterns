package com.jueee.example01;


public class NonterminalExpression extends AbstractExpression {
    
    private AbstractExpression left;
    private AbstractExpression right;

    public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context ctx) {
        // 递归调用每一个组成部分的interpret()方法
        // 在递归调用时指定组成部分的连接方式，即非终结符的功能
    }
}