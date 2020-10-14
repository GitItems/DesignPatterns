package com.entity;

/**
 * @ProjectName: Adapter
 * @Package: com.entity
 * @ClassName: Player
 * @Author: MrChen
 * @Date: 2020/10/14 14:04
 */
public abstract class Player {

    protected String name;

    public Player(String name){
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
