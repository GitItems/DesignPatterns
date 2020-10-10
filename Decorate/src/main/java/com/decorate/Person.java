package com.decorate;

/**
 * @ProjectName: Decorate
 * @Package: com.decorate
 * @ClassName: Person
 * @Author: MrChen
 * @Date: 2020/10/9 15:52
 */
public class Person {

    private String name;


    public Person(String name) {
        this.name = name;
    }

    public Person(){}

    public void show(){
        System.out.println("装饰" + name);
    }
}
