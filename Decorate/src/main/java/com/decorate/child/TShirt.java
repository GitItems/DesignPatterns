package com.decorate.child;

import com.decorate.Decorate;

/**
 * @ProjectName: Decorate
 * @Package: com.decorate.child
 * @ClassName: TShirt
 * @Author: MrChen
 * @Date: 2020/10/9 16:00
 */
public class TShirt extends Decorate {

    @Override
    public void show(){
        System.out.println("短袖");
        super.show();
    }
}
