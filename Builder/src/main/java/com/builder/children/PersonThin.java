package com.builder.children;

import com.builder.PersonBuilder;

/**
 * @ProjectName: Builder
 * @Package: com.builder.children
 * @ClassName: PersonThin
 * @Author: MrChen
 * @Date: 2020/10/12 15:05
 */
public class PersonThin extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("瘦瘦的头!");
    }

    @Override
    public void buildBody() {
        System.out.println("瘦瘦的身体!");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("瘦瘦的左胳膊!");
    }

    @Override
    public void buildArmRight() {
        System.out.println("瘦瘦的右胳膊!");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("瘦瘦的左腿!");
    }

    @Override
    public void buildLegRight() {
        System.out.println("瘦瘦的右腿!");
    }
}
