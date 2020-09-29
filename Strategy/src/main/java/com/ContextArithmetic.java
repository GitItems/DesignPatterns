package com;

import com.strategy.ArithmeticStrategy;
import com.strategy.DiscountArithmetic;
import com.strategy.MoneyOffArithmetic;
import com.strategy.NormalArithmetic;

/**
 * @ProjectName: Strategy
 * @Package: com
 * @ClassName: ContextArithmetic
 * @Author: MrChen
 * @Date: 2020/9/29 14:48
 */
public class ContextArithmetic {

    private ArithmeticStrategy arithmeticStrategy;

    /**
     * @Param: [type: 1:正常收费,2:满减优惠,3:折扣优惠]
     * @Return: com.strategy.ArithmeticStrategy
     * @Author: we
     * @Date: 2020/9/29 14:58
     */
    public ContextArithmetic(int type){

        ArithmeticStrategy arithmeticStrategy = null;
        switch (type){
            case 1:
                arithmeticStrategy = new NormalArithmetic();
                break;
            case 2:
                arithmeticStrategy = new MoneyOffArithmetic(120,10);
                break;
            case 3:
                arithmeticStrategy = new DiscountArithmetic(0.8);
                break;
            default:
                arithmeticStrategy = new NormalArithmetic();
        }

        this.arithmeticStrategy = arithmeticStrategy;
    }

    public String getResult(double price, int number) {

        String result = this.arithmeticStrategy.getResult(price, number);
        return result;
    }


}
