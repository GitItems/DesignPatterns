package com.entity.children;

import com.entity.Player;

/**
 * @ProjectName: Adapter
 * @Package: com.entity.children
 * @ClassName: Forwards
 * @Author: MrChen
 * @Date: 2020/10/14 14:06
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Forwards "+ name +" Attack!");
    }

    @Override
    public void defense() {
        System.out.println("Forwards "+ name +" Defense!");
    }
}
