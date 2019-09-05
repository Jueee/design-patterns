package com.jueee.example01;

/**
 * （具体策略类）折扣策略
 */
public class StrategyB implements Strategy {

    private Double money;

    private Double discount;

    public StrategyB(Double money, Double discount) {
        this.money = money;
        this.discount = discount;
    }

    @Override
    public Double getResult() {
        return money * discount;
    }

}
