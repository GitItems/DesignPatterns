package com.prototype.entity;

import com.prototype.IPrototype;

import java.util.Map;

/**
 * @ProjectName: Prototype
 * @Package: com.prototype.entity
 * @ClassName: Prototype
 * @Author: MrChen
 * @Date: 2020/10/10 14:34
 */
public class Prototype implements IPrototype {

    public Map map;

    /**
     * @Param: []
     * @Return: com.prototype.entity.Prototype
     * @Author: we
     * @Date: 2020/10/10 14:35
     * 通过clone 可手动添加引用类型，避免直接复制引用地址导致引用类型为null
     */
    @Override
    public Prototype cloneNew() {
        Prototype prototype = new Prototype();
        prototype.map = this.map;
        return prototype;
    }
}
