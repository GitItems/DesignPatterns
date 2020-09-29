package com.strategy;

/**
 * @ProjectName: Strategy
 * @Package: com.strategy
 * @ClassName: MoneyOffArithmetic
 * @Author: MrChen
 * @Date: 2020/9/29 14:33
 */
public class MoneyOffArithmetic extends ArithmeticStrategy {

    private double discountsMoney = 0.0; // 优惠金额

    private double subtractMoney = 0.0; // 减去金额

    @Override
    public String getResult(double price, int number) throws ArithmeticException {

        double result = number * price;
        // 是否属于满减力度
        if (result > discountsMoney) {
            int discounts = (int) (result / discountsMoney);
            result = result - (discounts * subtractMoney);
        }
        return String.valueOf(result);
    }

    public MoneyOffArithmetic(double discountsMoney, double subtractMoney){

        this.discountsMoney = discountsMoney;
        this.subtractMoney = subtractMoney;

    }
}
