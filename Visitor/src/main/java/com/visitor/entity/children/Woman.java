package com.visitor.entity.children;

import com.visitor.Action;
import com.visitor.entity.Person;

/**
 * @ProjectName: Visitor
 * @Package: com.visitor.entity
 * @ClassName: Woman
 * @Author: MrChen
 * @Date: 2020/10/26 18:25
 */
public class Woman extends Person {
    private String type = "女人";

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }


    public String getType() {
        return type;
    }
}
