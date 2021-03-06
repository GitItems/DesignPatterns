package com.entity.children;

import com.entity.Player;

/**
 * @ProjectName: Adapter
 * @Package: com.entity.children
 * @ClassName: Center
 * @Author: MrChen
 * @Date: 2020/10/14 14:08
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Center "+ name +" Attack!");
    }

    @Override
    public void defense() {
        System.out.println("Center "+ name +" Defense!");
    }
}
