package com.jueee.example04;

public class AndNode extends AbstractNode {
    private AbstractNode left; // 左表达式
    private AbstractNode right; // 右表达式

    public AndNode(AbstractNode l, AbstractNode r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
    
    @Override
    public String toString() {
        return interpret();
    }

}
