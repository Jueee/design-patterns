package com.jueee.example03;

public class ExampleMain {

    public static void main(String[] args) {
        //创建品牌N
        HandsetBrand ab = new HandsetBrandN();

        //给品牌N安装游戏
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        //给品牌N安装通讯录
        ab.setHandsetSoft(new HandsetAddress());
        ab.run();
    }
}
