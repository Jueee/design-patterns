package com.jueee.example01;

/**
 * 抽象类
 */
public abstract class Leader {
    // 领导姓名
    protected String name;
    // 下一个处理的领导
    protected Leader nextLeader; // 责任链上的后继对象

    public Leader(String name) {
        super();
        this.name = name;
    }

    // 设定责任链上的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请求的核心的业务方法
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}
