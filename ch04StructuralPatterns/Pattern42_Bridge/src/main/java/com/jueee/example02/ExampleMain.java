package com.jueee.example02;

public class ExampleMain {

    public static void main(String[] args) {
        //给品牌N安装游戏
        HandsetBrand ab = new HandsetBrandNGame();
        ab.run();
        //给品牌N安装通讯录
        ab = new HandsetBrandNAddress();
        ab.run();
    }
}
