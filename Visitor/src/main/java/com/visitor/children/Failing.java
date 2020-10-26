package com.visitor.children;

import com.visitor.Action;
import com.visitor.entity.children.Man;
import com.visitor.entity.children.Woman;

/**
 * @ProjectName: Visitor
 * @Package: com.visitor.children
 * @ClassName: Failing
 * @Author: MrChen
 * @Date: 2020/10/26 18:45
 */
public class Failing extends Action {

    public Failing(){
        this.status = "失败";
    }

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getType() + this.status + "时,闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getType() + this.status + "时,眼泪汪汪谁也劝不了。");
    }
}
