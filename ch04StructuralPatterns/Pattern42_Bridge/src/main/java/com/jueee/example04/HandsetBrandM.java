package com.jueee.example04;

//品牌M
public class HandsetBrandM extends HandsetBrand {
    
    public HandsetBrandM(HandsetSoft soft) {
        super(soft);
    }

    @Override
    public void run(){
        System.out.println("HandsetBrandM run.");
        soft.run();
    }
}