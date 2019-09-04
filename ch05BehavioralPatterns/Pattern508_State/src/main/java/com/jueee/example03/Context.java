package com.jueee.example03;

/**
 * 使用环境（Context）角色：客户程序是通过它来满足自己的需求。它定义了客户程序需要的接口；并且维护一个具体状态角色的实例，这个实例来决定当前的状态。 由自身的状态决定自身的行为。
 */
public class Context {

    // 状态
    private State state;

    // 带有初始状态的构造器
    public Context(State state) {
        this.state = state;
    }

    // 设置初始状态
    public void setState(State state) {
        this.state = state;
    }

    // 下一步
    public void nextStep() {
        if (this.state != null) {
            this.state.nextStep(this);
        }
    }

    // 上一步
    public void lastStep() {
        if (this.state != null) {
            this.state.lastStep(this);
        }
    }

    // 返回当前状态
    public State getState() {
        return this.state;
    }

}
