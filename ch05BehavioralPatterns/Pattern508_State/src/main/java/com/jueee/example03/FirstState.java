package com.jueee.example03;

/**
 * 具体状态（Concrete State）角色：实现状态角色定义的接口。
 */
public class FirstState implements State {

    // first->null
    public void lastStep(Context ctx) {
        ctx.setState(null);
    }

    // first->second
    public void nextStep(Context ctx) {
        ctx.setState(new SecondState());
    }

    @Override
    public String toString() {
        return "First State";
    }

}
