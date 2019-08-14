package com.jueee.example01;

public class IDCard extends Product {
    
    private String owner;

    public IDCard(String owner) {
        System.out.println("创建" + owner + "的卡。");
        this.owner = owner;
    }

    public void use() {
        System.out.println("使用" + owner + "的卡。");
    }

    public String getOwner() {
        return owner;
    }
}
