package com.jueee.example04;

public class ExampleMain {

    public static void main(String[] args) {
        //创建品牌N
        HandsetBrand ab = new HandsetBrandN(new HandsetGame());
        //给品牌N安装游戏
        ab.run();
        //给品牌N安装通讯录
        ab = new HandsetBrandN(new HandsetAddress());
        ab.run();
    }
}
