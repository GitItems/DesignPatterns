package com.flyweight.entity;

/**
 * @ProjectName: Flyweight
 * @Package: com.flyweight.entity
 * @ClassName: User
 * @Author: MrChen
 * @Date: 2020/10/23 17:30
 */
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
