package com.impl;

/**
 * @ProjectName: Bridge
 * @Package: com.impl
 * @ClassName: Abstraction
 * @Author: MrChen
 * @Date: 2020/10/16 15:54
 */
public class Abstraction {
    protected  Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
