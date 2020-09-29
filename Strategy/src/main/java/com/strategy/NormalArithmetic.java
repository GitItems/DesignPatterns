package com.strategy;

/**
 * @ProjectName: ArithmeticStrategy
 * @Package: com.strategy
 * @ClassName: NormalArithmetic
 * @Author: MrChen
 * @Date: 2020/9/29 14:18
 */
public class NormalArithmetic extends ArithmeticStrategy{

    @Override
    public String getResult(double price, int number) throws ArithmeticException {
        double result = number * price;
        return String.valueOf(result);
    }
}
