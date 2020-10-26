package com.visitor;

import com.visitor.entity.children.Man;
import com.visitor.entity.children.Woman;

/**
 * @ProjectName: Visitor
 * @Package: com.visitor
 * @ClassName: Action
 * @Author: MrChen
 * @Date: 2020/10/26 18:23
 */
public abstract class Action {

    protected String status;

    public abstract void getManConclusion(Man concreteElementA);

    public abstract void getWomanConclusion(Woman concreteElementB);

}
