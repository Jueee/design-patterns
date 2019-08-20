package com.jueee.example04;

public class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String a) {
        this.action = a;
    }

    @Override
    public String interpret() {
        if (action.equalsIgnoreCase("move")) {
            return "移动";
        } else if (action.equalsIgnoreCase("run")) {
            return "奔跑";
        } else {
            return "无效指令";
        }
    }

}
