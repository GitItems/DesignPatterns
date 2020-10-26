package com.visitor.entity.children;

import com.visitor.Action;
import com.visitor.entity.Person;

/**
 * @ProjectName: Visitor
 * @Package: com.visitor.entity
 * @ClassName: Man
 * @Author: MrChen
 * @Date: 2020/10/26 18:25
 */
public class Man extends Person {

    private String type = "男人";
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }

    public String getType() {
        return type;
    }
}
