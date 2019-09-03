package com.jueee.example01;

public interface Subject {

    /**
     * 添加订阅者
     * @param observer observer
     */
    public void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer observer
     */
    public void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     */
    public void notify(String message);
}
