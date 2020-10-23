package com.iterator.concrete;

import com.iterator.Aggregate;
import com.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Iterator
 * @Package: com.iterator.concrete
 * @ClassName: ConcreteAggregate
 * @Author: MrChen
 * @Date: 2020/10/16 9:57
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    public int count(){
        return items.size();
    }

    public Object get(int index){
        return items.get(index);
    }

    public Object add(Object object){
        return items.add(object);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
