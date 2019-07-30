package com.jueee.example01;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        String[] items1 = new String[] {"奏国歌", "升国旗"};
        String[] items2 = new String[] {"观众鼓掌", "有序撤离"};
        builder.makeTitle("今日头条");
        builder.makeString("毕业典礼");
        builder.makeItems(items1);
        builder.makeString("典礼结束");
        builder.makeItems(items2);
        builder.close();
    }
}
