package com.observer;

/**
 * @ProjectName: Observer
 * @Package: com.observer
 * @ClassName: Observer
 * @Author: MrChen
 * @Date: 2020/10/13 14:07
 */
public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject){

        this.name = name;
        this.subject = subject;
    }

    public abstract void update();

}
