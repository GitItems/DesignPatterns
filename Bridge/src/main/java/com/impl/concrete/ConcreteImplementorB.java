package com.impl.concrete;

import com.impl.Implementor;

/**
 * @ProjectName: Bridge
 * @Package: com.impl.concrete
 * @ClassName: ConcreteImplementorB
 * @Author: MrChen
 * @Date: 2020/10/16 15:53
 */
public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
