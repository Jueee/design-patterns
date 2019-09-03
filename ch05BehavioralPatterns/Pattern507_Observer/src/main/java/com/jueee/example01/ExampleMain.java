package com.jueee.example01;

public class ExampleMain {

    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject = new SubscriptionSubject();

        // 创建微信用户
        WeixinUser user1 = new WeixinUser("张三");
        WeixinUser user2 = new WeixinUser("李四");
        WeixinUser user3 = new WeixinUser("王二");
        // 订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        // 公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("公众号内容更新了！");
    }
}
