package com.reponsibility.children.manager;

import com.reponsibility.Manager;
import com.reponsibility.entity.Request;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com.reponsibility.children
 * @ClassName: MajordomoManager
 * @Author: MrChen
 * @Date: 2020/10/23 8:56
 */
public class MajordomoManager extends Manager {

    public MajordomoManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getType()) && request.getNumber() <= 5){
            System.out.println(name + ":" + request.getContent() + + request.getNumber() + "天, 批准!");
        }else {
            if (superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
