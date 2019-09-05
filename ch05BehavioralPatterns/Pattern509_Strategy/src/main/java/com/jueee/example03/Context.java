package com.jueee.example03;

/**
 * 上下文
 */
public class Context {

    private Strategy strategy;

    /**
     * @param type 策略类型
     * @param money 价钱
     * @param subMoney 满减价钱
     * @param discount 折扣
     */
    public Context(StrategyTypeEnum strategyType, Double money, Double subMoney, Double discount) {
        switch (strategyType) {
            case 折扣:
                strategy = new StrategyB(money, discount);
                break;
            case 满减:
                strategy = new StrategyC(money, subMoney);
                break;
            default:
                strategy = new StrategyA(money);
                break;
        }
    }

    public Double getResult() {
        return strategy.getResult();
    }
}
