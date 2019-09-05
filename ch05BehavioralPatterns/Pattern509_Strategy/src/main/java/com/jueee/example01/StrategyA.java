package com.jueee.example01;

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
