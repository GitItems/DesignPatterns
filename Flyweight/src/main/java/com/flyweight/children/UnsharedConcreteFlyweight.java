package com.flyweight.children;

import com.flyweight.Flyweight;

/**
 * @ProjectName: Flyweight
 * @Package: com.flyweight.children
 * @ClassName: UnsharedConcreteFlyweight
 * @Author: MrChen
 * @Date: 2020/10/23 14:34
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体Flyweight:" + extrinsicState);
    }
}
