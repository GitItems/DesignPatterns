package com.component;

/**
 * @ProjectName: Component
 * @Package: com.component
 * @ClassName: Company
 * @Author: MrChen
 * @Date: 2020/10/15 13:55
 */
public abstract class Company {

    protected String name;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company c);

    public abstract void remove(Company c);

    public abstract void display(int depth);

    public abstract void lineOfDuty();
}
