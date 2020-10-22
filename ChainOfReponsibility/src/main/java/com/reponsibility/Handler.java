package com.reponsibility;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com.reponsibility
 * @ClassName: Handler
 * @Author: MrChen
 * @Date: 2020/10/22 17:40
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
