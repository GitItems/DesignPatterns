package com;

import com.facade.pack.Fund;

/**
 * @ProjectName: Facade
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/12 13:52
 */
public class Test {

    public static void main(String[] args) {

        Fund fund = new Fund();

        fund.buyFundA();
        fund.sellFundA();
    }
}
