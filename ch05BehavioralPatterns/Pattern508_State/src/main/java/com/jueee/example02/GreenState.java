package com.jueee.example02;

/*
 * 绿色状态类，实现的接口的方法，通过状态管理器在上一个或者下一个方法中 设置改变后的状态
 */
public class GreenState implements State {

    public String getState() {
        return "green";
    }

    public void last(Context c) {
        c.setState(new RedState());
    }

    public void next(Context c) {
        c.setState(new BlueState());
    }

}