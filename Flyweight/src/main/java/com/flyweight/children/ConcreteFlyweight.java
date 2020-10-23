package com.flyweight.children;

import com.flyweight.Flyweight;

/**
 * @ProjectName: Flyweight
 * @Package: com.flyweight.children
 * @ClassName: ConcreteFlyweight
 * @Author: MrChen
 * @Date: 2020/10/23 14:32
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体的Flyweight:" + extrinsicState);
    }
}
