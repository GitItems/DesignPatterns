package com.entity.children.adapter;

import com.entity.Player;
import com.entity.children.Center;
import com.entity.children.ForeignCenter;

/**
 * @ProjectName: Adapter
 * @Package: com.entity.children.adapter
 * @ClassName: Translator
 * @Author: MrChen
 * @Date: 2020/10/14 14:15
 */
public class Translator extends Player {

    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.attack();
    }

    @Override
    public void defense() {
        wjzf.defense();
    }
}
