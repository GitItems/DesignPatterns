package com;

import com.entity.Player;
import com.entity.children.Center;
import com.entity.children.Forwards;
import com.entity.children.Guards;
import com.entity.children.adapter.Translator;

/**
 * @ProjectName: Adapter
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/14 12:00
 */
public class Test {

    public static void main(String[] args) {

        Player b = new Forwards("巴蒂尔");
        b.attack();
        Player m = new Guards("麦克格雷迪");
        m.attack();
        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
