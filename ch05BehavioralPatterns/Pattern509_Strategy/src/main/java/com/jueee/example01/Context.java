package com.jueee.example01;

/**
 * 上下文
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Double getResult() {
        return strategy.getResult();
    }
}
