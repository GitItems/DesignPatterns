package com.impl.handset.brand.concrete;

import com.impl.handset.brand.HandsetBrand;

/**
 * @ProjectName: Bridge
 * @Package: com.impl.handset.brand.concrete
 * @ClassName: HandsetBrandB
 * @Author: MrChen
 * @Date: 2020/10/16 16:37
 */
public class HandsetBrandB extends HandsetBrand {

    public HandsetBrandB() {
        name = "华为";
    }

    @Override
    public void run() {
        System.out.print("品牌:" + name);
        soft.run();
    }
}
