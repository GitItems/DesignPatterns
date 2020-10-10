package com.decorate.child;

import com.decorate.Decorate;

/**
 * @ProjectName: Decorate
 * @Package: com.decorate.child
 * @ClassName: Pants
 * @Author: MrChen
 * @Date: 2020/10/9 15:57
 */
public class Pants extends Decorate {

    @Override
    public void show(){
        System.out.println("内裤");
        super.show();
    }

}
