package com.decorate;

/**
 * @ProjectName: Decorate
 * @Package: com.decorate
 * @ClassName: Decorate
 * @Author: MrChen
 * @Date: 2020/10/9 16:07
 */
public class Decorate extends Person {

    protected Person component;

    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show(){
        if (component != null){
            component.show();
        }
    }
}
