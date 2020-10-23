package com.facade.pack;

import com.facade.StockOne;
import com.facade.StockThree;
import com.facade.StockTwo;

/**
 * @ProjectName: Facade
 * @Package: com.facade.pack
 * @ClassName: Fund
 * @Author: MrChen
 * @Date: 2020/10/12 13:58
 */
public class Fund {

    private StockOne stockOne;
    private StockTwo stockTwo;
    private StockThree stockThree;

    public Fund(){
        stockOne = new StockOne();
        stockTwo = new StockTwo();
        stockThree = new StockThree();
    }

    public void buyFundA(){
        stockOne.buy();
        stockTwo.buy();
        stockThree.buy();
    }

    public void sellFundA(){
        stockOne.sell();
        stockTwo.sell();
        stockThree.sell();
    }
}
