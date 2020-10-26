package com.visitor.children;

import com.visitor.Action;
import com.visitor.entity.children.Man;
import com.visitor.entity.children.Woman;

/**
 * @ProjectName: Visitor
 * @Package: com.visitor.children.action
 * @ClassName: Success
 * @Author: MrChen
 * @Date: 2020/10/26 18:26
 */
public class Success extends Action {

    public Success(){
        this.status = "成功";
    }

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + this.status + "时,背后多半有一个伟大的女人。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + this.status + "时,背后大多有一个不成功的男人。");
    }
}
