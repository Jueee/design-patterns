package com.jueee.example03;

public class ExampleMain {
    
    public static void main(String[] args) {
        // 顺行起点first
        State state = new FirstState();
        Context ctx = new Context(state);
        for (int i = 0; i < 6; i++) {
            state = ctx.getState();
            System.out.print(state);
            if (state == null) {
                break;
            }
            System.out.print("->");
            // 顺流
            ctx.nextStep();
        }
        System.out.println("");

        // 逆行起点third
        state = new ThirdState();
        ctx = new Context(state);
        for (int i = 0; i < 6; i++) {
            state = ctx.getState();

            System.out.print(state);
            if (state == null) {
                break;
            }
            System.out.print("->");
            // 逆流
            ctx.lastStep();
        }
    }
}
