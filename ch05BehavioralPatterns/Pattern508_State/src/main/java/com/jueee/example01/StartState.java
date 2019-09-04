package com.jueee.example01;

// 实现类StartState.java
public class StartState implements State {
    
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
