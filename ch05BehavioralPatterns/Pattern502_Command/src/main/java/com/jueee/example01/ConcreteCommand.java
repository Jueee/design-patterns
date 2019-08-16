package com.jueee.example01;

// 具体实现的命令
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void exe() {
        receiver.action();
    }
}
