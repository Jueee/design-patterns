package com.jueee.example04;

public class SentenceNode extends AbstractNode {
    
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distanc;

    public SentenceNode(AbstractNode direc, AbstractNode a, AbstractNode d) {
        this.direction = direc;
        this.action = a;
        this.distanc = d;
    }

    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distanc.interpret();
    }
    
    @Override
    public String toString() {
        return interpret();
    }

}
