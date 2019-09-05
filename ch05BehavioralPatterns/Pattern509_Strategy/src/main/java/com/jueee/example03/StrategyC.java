package com.jueee.example03;

/**
 * （具体策略类）满减策略
 */
public class StrategyC implements Strategy {

    private Double money;

    private Double subMoney;

    public StrategyC(Double money, Double subMoney) {
        this.money = money;
        this.subMoney = subMoney;
    }

    @Override
    public Double getResult() {
        if (money > subMoney) {
            return money - subMoney;
        }
        return money;
    }

}
