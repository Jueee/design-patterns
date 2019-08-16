package com.jueee.example01;

/**
 * 封装请假的基本信息
 */
public class LeaveRequest {
    // 员工名称
    private String empName;
    // 请假天数
    private int leaveDays;
    // 请假原因
    private String reason;

    public LeaveRequest(String empName, int leaveDays, String reason) {
        super();
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "员工：" + getEmpName() + "请假，天数：" + getLeaveDays() + ",理由：" + getReason();
    }
}
