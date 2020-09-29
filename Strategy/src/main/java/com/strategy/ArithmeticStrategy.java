package com.strategy;

/**
 * @ProjectName: ArithmeticStrategy
 * @Package: com.strategy
 * @ClassName: ArithmeticStrategy
 * @Author: MrChen
 * @Date: 2020/9/29 14:12
 * 算法类
 */
public abstract class ArithmeticStrategy {

    public abstract String getResult(double price, int number) throws ArithmeticException;
}
