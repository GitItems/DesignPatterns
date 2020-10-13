package com.prototype;

import com.prototype.entity.Prototype;

/**
 * @ProjectName: Prototype
 * @Package: com.prototype
 * @ClassName: IPrototype
 * @Author: MrChen
 * @Date: 2020/10/10 14:32
 */
public interface IPrototype {

    /**
     * @Param: []
     * @Return: com.prototype.entity.Prototype
     * @Author: we
     * @Date: 2020/10/10 14:38
     *
     * Java Object类默认有clone方法，类需克隆可直接实现Object的clone方法即可
     */
    Object cloneNew();
}
