package com.jueee.example03;

/**
 * 具体状态（Concrete State）角色：实现状态角色定义的接口。
 */
public class SecondState implements State {

    // second->first
    public void lastStep(Context ctx) {
        ctx.setState(new FirstState());
    }

    // second->third
    public void nextStep(Context ctx) {
        ctx.setState(new ThirdState());
    }

    @Override
    public String toString() {
        return "Second State";
    }

}
