package com.reponsibility;

import com.reponsibility.entity.Request;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com.reponsibility
 * @ClassName: Manager
 * @Author: MrChen
 * @Date: 2020/10/23 8:47
 */
public abstract class Manager {

    protected Manager superior;
    protected String name;

    public Manager(String name){
        this.name = name;
    }

    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}
