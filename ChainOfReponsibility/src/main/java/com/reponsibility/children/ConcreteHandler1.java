package com.reponsibility.children;

import com.reponsibility.Handler;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com.reponsibility.children
 * @ClassName: ConcreteHandler1
 * @Author: MrChen
 * @Date: 2020/10/22 17:42
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request > 0 && request < 20){
            System.out.println("蛋蛋处理了请求!");
        }else {
            successor.handleRequest(request);
        }
    }
}
