package com.reponsibility.children.manager;

import com.reponsibility.Manager;
import com.reponsibility.entity.Request;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com.reponsibility.children
 * @ClassName: CommonManager
 * @Author: MrChen
 * @Date: 2020/10/23 8:52
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getType()) && request.getNumber() <= 2){
            System.out.println(name + ":" + request.getContent() + request.getNumber() + "天,批准!");
        }else {
            if (superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
