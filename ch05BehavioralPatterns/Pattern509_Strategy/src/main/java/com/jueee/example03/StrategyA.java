package com.jueee.example03;

/**
 * （具体策略类）原价策略
 */
public class StrategyA implements Strategy{

    private Double money;

    public StrategyA(Double money) {
        this.money = money;
    }

    @Override
    public Double getResult() {
        return money;
    }

}
