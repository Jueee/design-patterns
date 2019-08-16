package com.jueee.example02;

/**
 * CEO，可以批准50%以内的折扣
 */
public class CEO extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.5) {
            System.out.format("%s批准了折扣：%.2f\n", this.getClass().getName(), discount);
        } else {
            System.out.format("%s拒绝了折扣：%.2f\n", this.getClass().getName(), discount);
        }
    }

}
