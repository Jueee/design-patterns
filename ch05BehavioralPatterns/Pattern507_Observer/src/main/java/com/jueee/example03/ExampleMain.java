package com.jueee.example03;

public class ExampleMain {
    
    public static void main(String[] args) {
        // 老板
        Boss boss = new Boss();
        // 看股票的同事
        StockObserver worker1 = new StockObserver("舒克", boss);
        // 看NBA的同事
        NBAObserver worker2 = new NBAObserver("贝塔", boss);

        boss.attach(worker1);
        boss.attach(worker2);

        boss.detach(worker1);

        // 老板回来
        boss.setAction("我胡汉三回来啦！");

        // 发出通知
        boss.notice();
    }
}
