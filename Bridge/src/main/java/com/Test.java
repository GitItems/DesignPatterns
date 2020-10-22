package com;

import com.impl.handset.brand.HandsetBrand;
import com.impl.handset.brand.concrete.HandsetBrandA;
import com.impl.handset.brand.concrete.HandsetBrandB;
import com.impl.handset.soft.concrete.HandsetAddressList;
import com.impl.handset.soft.concrete.HandsetGame;

/**
 * @ProjectName: Bridge
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/16 15:49
 */
public class Test {

    public static void main(String[] args) {

        HandsetBrand brand = new HandsetBrandA();
        brand.setSoft(new HandsetGame());
        brand.run();
        brand.setSoft(new HandsetAddressList());
        brand.run();
    }
}
