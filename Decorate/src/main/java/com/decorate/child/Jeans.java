package com.decorate.child;

import com.decorate.Decorate;

/**
 * @ProjectName: Decorate
 * @Package: com.decorate.child
 * @ClassName: Jeans
 * @Author: MrChen
 * @Date: 2020/10/9 16:01
 */
public class Jeans extends Decorate {



    @Override
    public void show(){
        System.out.println("牛仔裤");
        super.show();
    }
}
