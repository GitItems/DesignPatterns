package com.strategy;

/**
 * @ProjectName: Strategy
 * @Package: com.strategy
 * @ClassName: DiscountArithmetic
 * @Author: MrChen
 * @Date: 2020/9/29 14:44
 */
public class DiscountArithmetic extends ArithmeticStrategy {

    private double discount = 0.0;

    @Override
    public String getResult(double price, int number) throws ArithmeticException {
        double result = (number * price) * discount;
        return String.valueOf(result);
    }

    public DiscountArithmetic(double discount){

        this.discount = discount;
    }
}
