package com.builder.children;

import com.builder.PersonBuilder;

/**
 * @ProjectName: Builder
 * @Package: com.builder.children
 * @ClassName: PersonFat
 * @Author: MrChen
 * @Date: 2020/10/12 15:07
 */
public class PersonFat extends PersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("胖胖的头!");
    }

    @Override
    public void buildBody() {
        System.out.println("胖胖的身体!");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("胖胖的左胳膊!");
    }

    @Override
    public void buildArmRight() {
        System.out.println("胖胖的右胳膊!");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("胖胖的左腿!");
    }

    @Override
    public void buildLegRight() {
        System.out.println("胖胖的右腿!");
    }
}
