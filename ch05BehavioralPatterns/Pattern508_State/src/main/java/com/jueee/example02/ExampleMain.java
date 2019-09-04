package com.jueee.example02;

public class ExampleMain {

    public static void main(String[] args) throws InterruptedException {
        /* 
         * 创建一个状态管理器，设置初始状态为红色， 
         * 然后就可以执行状态管理器的last或者next方法 
         */
        Context c = new Context();
        State redsState = new RedState();
        c.setState(redsState);
        while (true) {
            System.out.println("------------");
            System.out.println("当前状态：" + c.getState().getState());
            System.out.print("下一个状态: ");
            c.pull();
            Thread.currentThread().sleep(2000);
        }
    }
}
