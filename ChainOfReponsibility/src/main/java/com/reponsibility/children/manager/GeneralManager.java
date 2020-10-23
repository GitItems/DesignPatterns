package com.reponsibility.children.manager;

import com.reponsibility.Manager;
import com.reponsibility.entity.Request;

/**
 * @ProjectName: ChainOfReponsibility
 * @Package: com.reponsibility.children
 * @ClassName: GeneralManager
 * @Author: MrChen
 * @Date: 2020/10/23 8:57
 */
public class GeneralManager extends Manager {


    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getType())){
            System.out.println(name + ":" + request.getContent() + request.getNumber() +"天,批准!");
        }else if("加薪".equals(request.getType()) && request.getNumber() <= 500){
            System.out.println(name + ":" + request.getContent() + request.getNumber() +  "￥,批准!");
        }else if ("加薪".equals(request.getType())){
            System.out.println(name + ":" + request.getContent() + request.getNumber() + "￥,再说吧!");
        }else {
             if (superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
