package com.flyweight.factory;

import com.flyweight.Flyweight;
import com.flyweight.children.ConcreteFlyweight;

import java.util.Hashtable;

/**
 * @ProjectName: Flyweight
 * @Package: com.flyweight.factory
 * @ClassName: FlyweightFactory
 * @Author: MrChen
 * @Date: 2020/10/23 14:35
 */
public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory(){
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return (Flyweight) flyweights.get(key);
    }
}
