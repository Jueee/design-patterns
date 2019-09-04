package com.jueee.example01;

// 上下文Context.java 实际运用时可自行更改
public class Context {
    
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
