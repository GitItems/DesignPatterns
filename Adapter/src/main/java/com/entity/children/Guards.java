package com.entity.children;

import com.entity.Player;

/**
 * @ProjectName: Adapter
 * @Package: com.entity.children
 * @ClassName: Guards
 * @Author: MrChen
 * @Date: 2020/10/14 14:09
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Guards "+ name +" Attack!");
    }

    @Override
    public void defense() {
        System.out.println("Guards "+ name +" Defense!");
    }
}
