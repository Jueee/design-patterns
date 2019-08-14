package com.jueee.example04;

// 品牌N
public class HandsetBrandN extends HandsetBrand {
    
    public HandsetBrandN(HandsetSoft soft) {
        super(soft);
    }
    
    @Override
    public void run() {
        System.out.println("HandsetBrandN run.");
        soft.run();
    }
}