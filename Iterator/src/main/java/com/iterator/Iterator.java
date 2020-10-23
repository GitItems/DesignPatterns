package com.iterator;

/**
 * @ProjectName: Iterator
 * @Package: com.iterator
 * @ClassName: Iterator
 * @Author: MrChen
 * @Date: 2020/10/16 9:56
 */
public abstract class Iterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();

}
