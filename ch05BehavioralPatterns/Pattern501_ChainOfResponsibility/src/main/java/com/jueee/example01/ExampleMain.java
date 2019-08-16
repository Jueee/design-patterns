package com.jueee.example01;

public class ExampleMain {
    
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader b2 = new ViceGeneralManager("王五");
        Leader c = new GeneralManager("赵六");
        // 组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(b2);
        b2.setNextLeader(c);

        // 开始请假操作
        LeaveRequest req1 = new LeaveRequest("TOM1", 15, "老婆生孩子回家探望！");
        a.handleRequest(req1);
        System.out.println("---------------------------");

        LeaveRequest req2 = new LeaveRequest("TOM2", 1, "老婆生孩子回家探望！");
        a.handleRequest(req2);
        System.out.println("---------------------------");

        LeaveRequest req3 = new LeaveRequest("TOM3", 3, "老婆生孩子回家探望！");
        a.handleRequest(req3);
        System.out.println("---------------------------");

        LeaveRequest req4 = new LeaveRequest("TOM4", 25, "老婆生孩子回家探望！");
        a.handleRequest(req4);
        System.out.println("---------------------------");

        LeaveRequest req5 = new LeaveRequest("TOM5", 35, "老婆生孩子回家探望！");
        a.handleRequest(req5);
    }
    
}
