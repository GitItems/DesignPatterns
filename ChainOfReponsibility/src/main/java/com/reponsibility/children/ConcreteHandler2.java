package com.reponsibility.children;

import com.reponsibility.Handler;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com.reponsibility.children
 * @ClassName: ConcreteHandler2
 * @Author: MrChen
 * @Date: 2020/10/22 17:43
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20){
            System.out.println("格格处理了请求!");
        }else {
            successor.handleRequest(request);
        }

    }
}
