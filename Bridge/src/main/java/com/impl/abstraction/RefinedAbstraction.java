package com.impl.abstraction;

import com.impl.Abstraction;

/**
 * @ProjectName: Bridge
 * @Package: com.impl.concrete
 * @ClassName: RefinedAbstraction
 * @Author: MrChen
 * @Date: 2020/10/16 15:56
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation(){
        implementor.operation();
    }
}
