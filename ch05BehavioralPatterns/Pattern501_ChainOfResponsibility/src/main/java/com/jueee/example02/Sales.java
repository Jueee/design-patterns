package com.jueee.example02;

/**
 * 销售员，可以批准10%以内的折扣
 */
public class Sales extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.1) {
            System.out.format("%s批准了折扣：%.2f\n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }

}
