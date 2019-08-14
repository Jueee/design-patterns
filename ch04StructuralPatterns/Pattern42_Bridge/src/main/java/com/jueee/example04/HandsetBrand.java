package com.jueee.example04;

public abstract class HandsetBrand {
    // 弱聚合
    protected HandsetSoft soft;

    // 设置手机软件
    public HandsetBrand(HandsetSoft soft) {
        this.soft = soft;
    }

    // 运行
    public abstract void run();
}
