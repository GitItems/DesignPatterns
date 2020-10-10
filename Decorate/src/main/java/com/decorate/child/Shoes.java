package com.decorate.child;

import com.decorate.Decorate;

/**
 * @ProjectName: Decorate
 * @Package: com.decorate.child
 * @ClassName: Shoes
 * @Author: MrChen
 * @Date: 2020/10/9 16:02
 */
public class Shoes extends Decorate {

    @Override
    public void show(){
        System.out.println("鞋子");
        super.show();
    }
}
