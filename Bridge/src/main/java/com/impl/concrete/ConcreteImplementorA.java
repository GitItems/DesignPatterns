package com.impl.concrete;

import com.impl.Implementor;

/**
 * @ProjectName: Bridge
 * @Package: com.impl.concrete
 * @ClassName: ConcreteImplementorA
 * @Author: MrChen
 * @Date: 2020/10/16 15:52
 */
public class ConcreteImplementorA extends Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
