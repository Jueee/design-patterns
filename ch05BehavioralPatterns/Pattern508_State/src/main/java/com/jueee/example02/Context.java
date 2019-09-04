package com.jueee.example02;

/*
 * 状态管理器，设置初始状态，得到当前状态， 提供了两个操作：
 * 上一个的操作方法中，调用了当前状态的last方法，将状态管理器的状态更新
 * 下一个的操作方法中，调用了当前状态的next方法，将状态管理器的状态更新
 */
public class Context {

    private State state = null;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void push() {
        state.last(this);
        System.out.println(state.getState());
    }

    public void pull() {
        state.next(this);
        System.out.println(state.getState());
    }

}
