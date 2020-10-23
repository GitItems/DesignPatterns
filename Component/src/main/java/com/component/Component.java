package com.component;

/**
 * @ProjectName: Component
 * @Package: com.component
 * @ClassName: Component
 * @Author: MrChen
 * @Date: 2020/10/15 10:46
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);

}
