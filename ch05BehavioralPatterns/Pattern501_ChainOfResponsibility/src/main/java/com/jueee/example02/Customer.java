package com.jueee.example02;

public class Customer {

    private PriceHandler pricHandler;

    public void setPriceHandler(PriceHandler pricHandler) {
        this.pricHandler = pricHandler;
    }

    public void requestDiscount(float discount) {
        pricHandler.processDiscount(discount);
    }

}
