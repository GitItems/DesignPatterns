package com.impl.handset.brand;

import com.impl.handset.soft.HandsetSoft;

/**
 * @ProjectName: Bridge
 * @Package: com.impl.handset
 * @ClassName: HandsetBrand
 * @Author: MrChen
 * @Date: 2020/10/16 16:34
 */
public abstract class HandsetBrand {

    protected String name;

    protected HandsetSoft soft;

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
