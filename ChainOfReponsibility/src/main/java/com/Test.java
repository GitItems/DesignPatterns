package com;

import com.reponsibility.Handler;
import com.reponsibility.children.ConcreteHandler1;
import com.reponsibility.children.ConcreteHandler2;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com
 * @ClassName: Test
 * @Author: MrChen
 * @Date: 2020/10/22 17:38
 */
public class Test {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);

        handler1.handleRequest(22);
    }
}
