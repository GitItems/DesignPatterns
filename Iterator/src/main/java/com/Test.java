package com;

import com.iterator.Iterator;
import com.iterator.concrete.ConcreteAggregate;
import com.iterator.concrete.ConcreteIterator;
import com.iterator.concrete.ConcreteIteratorDesc;

/**
 * @ProjectName: Iterator
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/16 9:53
 */
public class Test {

    public static void main(String[] args) {

        ConcreteAggregate aggregate = new ConcreteAggregate();

        aggregate.add("大鸟");
        aggregate.add("小菜");
        aggregate.add("行李");
        aggregate.add("老外");
        aggregate.add("公司内部员工");
        aggregate.add("小偷");

        Iterator iterator = new ConcreteIteratorDesc(aggregate);
//        Object item = iterator.first();

        while (!iterator.isDone()){
            System.out.println(iterator.currentItem() + "请买车票!");
            iterator.next();
        }
    }
}
