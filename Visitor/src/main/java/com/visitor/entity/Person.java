package com.visitor.entity;

import com.visitor.Action;

/**
 * @ProjectName: Visitor
 * @Package: com.visitor
 * @ClassName: Person
 * @Author: MrChen
 * @Date: 2020/10/26 18:26
 */
public abstract class Person {

    public abstract void accept(Action visitor);
}
