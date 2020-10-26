package com.visitor.children;

import com.visitor.Action;
import com.visitor.entity.children.Man;
import com.visitor.entity.children.Woman;

/**
 * @ProjectName: Visitor
 * @Package: com.visitor.children
 * @ClassName: Amativeness
 * @Author: MrChen
 * @Date: 2020/10/26 18:46
 */
public class Amativeness extends Action {

    public Amativeness(){
        this.status = "恋爱";
    }


    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + this.status + "时,凡事不懂也要懂。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + this.status + "时,遇事懂也装作不懂。");
    }
}
