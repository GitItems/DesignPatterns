package com.iterator.concrete;

import com.iterator.Iterator;

/**
 * @ProjectName: Iterator
 * @Package: com.iterator.concrete
 * @ClassName: ConcreteIteratorDesc
 * @Author: MrChen
 * @Date: 2020/10/16 10:56
 */
public class ConcreteIteratorDesc extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate){
        this.aggregate = aggregate;
        current = aggregate.count() - 1;
    }

    @Override
    public Object first() {
        return aggregate.get(aggregate.count() - 1);
    }

    @Override
    public Object next() {

        Object ret = null;
        current --;
        if (current >= 0){
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}
