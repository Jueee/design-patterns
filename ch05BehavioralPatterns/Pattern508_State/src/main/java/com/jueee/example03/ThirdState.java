package com.jueee.example03;

/**
 * 具体状态（Concrete State）角色：实现状态角色定义的接口。
 */
public class ThirdState implements State {

    // third->second
    public void lastStep(Context ctx) {
        ctx.setState(new SecondState());
    }

    // third->null
    public void nextStep(Context ctx) {
        ctx.setState(null);
    }

    @Override
    public String toString() {
        return "Third State";
    }

}
